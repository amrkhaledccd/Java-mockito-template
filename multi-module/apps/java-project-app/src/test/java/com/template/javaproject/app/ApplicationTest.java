package com.template.javaproject.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import com.template.javaproject.commons.model.ApplicationInfo;
import com.template.javaproject.commons.util.JavaProjectHelper;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThatCode;

@ExtendWith(MockitoExtension.class)
public class ApplicationTest {

    @Mock
    private JavaProjectHelper mockHelper;

    @BeforeEach
    void setUp() {
        Application.setHelper(mockHelper);
    }

    @Test
    void shouldFetchFromUtil() {
        // given
        ApplicationInfo testInfo = new ApplicationInfo(
            "test",
            "Test",
            "0.0.0"
        );
        when(mockHelper.getAppInfo())
            .thenReturn(testInfo);

        // expect
        assertThatCode(() -> Application.main(new String[]{}))
            .doesNotThrowAnyException();
    }
}