package org.apache.commons.compress.archivers;

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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArchiveStreamFactory_setEntryEncoding_6703016110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public ArchiveStreamFactory_setEntryEncoding_6703016110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        setField(term68, term68.getClass(), "encoding", "xxtlPwDYFs");
        setField(term68, term68.getClass(), "entryEncoding", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        try {
            callMethod(klass, "setEntryEncoding", argTypes, term68, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


