package com.template.javaproject.model;

import java.util.UUID;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationInfoTest {
    @Test
    void shouldMemberFields() {
        // given
        ApplicationInfo info = new ApplicationInfo(
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString()
        );

        // expect
        assertThat(info.getName()).isNotBlank();
        assertThat(info.getDescription()).isNotBlank();
        assertThat(info.getVersion()).isNotBlank();
    }
}