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
import static org.apache.commons.compress.archivers.EqualityUtils.*;

public class ArchiveStreamFactory_getEntryEncoding_13734098399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term437;

    public ArchiveStreamFactory_getEntryEncoding_13734098399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        setField(term23, term23.getClass(), "encoding", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "entryEncoding", "MuLcgQHgqz");
        term437 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        setField(term437, term437.getClass(), "encoding", "sjlJAEtRrb");
        setField(term437, term437.getClass(), "entryEncoding", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEntryEncoding", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term437));
        assertTrue(recursiveEquals(retValue, "MuLcgQHgqz"));
    }

};


