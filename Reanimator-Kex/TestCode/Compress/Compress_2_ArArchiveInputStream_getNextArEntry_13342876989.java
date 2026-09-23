package org.apache.commons.compress.archivers.ar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArArchiveInputStream_getNextArEntry_13342876989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104326;

    public ArArchiveInputStream_getNextArEntry_13342876989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104326 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term104454 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term104582 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term104710 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term104838 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term104966 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105094 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105222 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105350 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105478 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105606 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105734 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105862 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term105990 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106118 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106246 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106374 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106502 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106630 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106758 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term106886 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107014 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107142 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107270 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107398 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107526 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107654 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107782 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term107910 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108038 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108166 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108294 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108422 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108550 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108678 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108806 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term108934 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109062 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109190 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109318 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109446 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109574 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term109622 = newInstance(Class.forName("java.io.InputStream$1"));
        setLongField(term104326, term104326.getClass(), "offset", 0L);
        setField(term109574, term109574.getClass(), "input", term109622);
        setLongField(term109574, term109574.getClass(), "offset", 0L);
        setField(term109446, term109446.getClass(), "input", term109574);
        setField(term109318, term109318.getClass(), "input", term109446);
        setField(term109190, term109190.getClass(), "input", term109318);
        setField(term109062, term109062.getClass(), "input", term109190);
        setField(term108934, term108934.getClass(), "input", term109062);
        setField(term108806, term108806.getClass(), "input", term108934);
        setField(term108678, term108678.getClass(), "input", term108806);
        setField(term108550, term108550.getClass(), "input", term108678);
        setField(term108422, term108422.getClass(), "input", term108550);
        setField(term108294, term108294.getClass(), "input", term108422);
        setField(term108166, term108166.getClass(), "input", term108294);
        setField(term108038, term108038.getClass(), "input", term108166);
        setField(term107910, term107910.getClass(), "input", term108038);
        setField(term107782, term107782.getClass(), "input", term107910);
        setField(term107654, term107654.getClass(), "input", term107782);
        setField(term107526, term107526.getClass(), "input", term107654);
        setField(term107398, term107398.getClass(), "input", term107526);
        setField(term107270, term107270.getClass(), "input", term107398);
        setField(term107142, term107142.getClass(), "input", term107270);
        setField(term107014, term107014.getClass(), "input", term107142);
        setField(term106886, term106886.getClass(), "input", term107014);
        setField(term106758, term106758.getClass(), "input", term106886);
        setField(term106630, term106630.getClass(), "input", term106758);
        setField(term106502, term106502.getClass(), "input", term106630);
        setField(term106374, term106374.getClass(), "input", term106502);
        setField(term106246, term106246.getClass(), "input", term106374);
        setField(term106118, term106118.getClass(), "input", term106246);
        setField(term105990, term105990.getClass(), "input", term106118);
        setField(term105862, term105862.getClass(), "input", term105990);
        setField(term105734, term105734.getClass(), "input", term105862);
        setField(term105606, term105606.getClass(), "input", term105734);
        setField(term105478, term105478.getClass(), "input", term105606);
        setField(term105350, term105350.getClass(), "input", term105478);
        setField(term105222, term105222.getClass(), "input", term105350);
        setField(term105094, term105094.getClass(), "input", term105222);
        setField(term104966, term104966.getClass(), "input", term105094);
        setField(term104838, term104838.getClass(), "input", term104966);
        setField(term104710, term104710.getClass(), "input", term104838);
        setField(term104582, term104582.getClass(), "input", term104710);
        setField(term104454, term104454.getClass(), "input", term104582);
        setField(term104326, term104326.getClass(), "input", term104454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextArEntry", argTypes, term104326, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


