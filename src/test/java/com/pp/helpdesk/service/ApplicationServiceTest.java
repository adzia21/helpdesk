package com.pp.helpdesk.service;

import com.pp.helpdesk.model.application.Application;
import com.pp.helpdesk.model.application.ApplicationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles("test")
public class ApplicationServiceTest {

    @Mock
    ApplicationRepository applicationRepository;

    @InjectMocks
    ApplicationService applicationService;

    @Test
    public void ShouldReturnApplicationWhenSaveApplication() {
        Application application = new Application("Pyłek", "Motylek", "Polski");

        when(applicationRepository.save(any(Application.class))).thenReturn(application);

        Application createdApplication = applicationService.saveApplication(application);
        verify(applicationRepository, times(1)).save(any());
        assertThat(createdApplication.getName()).isSameAs("Lama");
    }

    @Test
    public void ShouldNotReturnApplicationWhenSaveApplication() {
        Application application = new Application("Pyłek", "Motylek", "Polski");

        when(applicationRepository.save(any(Application.class))).thenReturn(application);

        Application createdApplication = applicationService.saveApplication(application);
        verify(applicationRepository, times(1)).save(any());
        assertThat(createdApplication.getName()).isNotSameAs("Lama");
    }
}