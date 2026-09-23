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

public class ArchiveStreamFactory_setEntryEncoding_6703016120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;
     Object term3237;

    public ArchiveStreamFactory_setEntryEncoding_6703016120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2319 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        setField(term2319, term2319.getClass(), "encoding", null);
        term3237 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        setField(term3237, term3237.getClass(), "encoding", null);
        setField(term3237, term3237.getClass(), "entryEncoding", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEntryEncoding", argTypes, term2319, args);
        assertTrue(recursiveEquals(term2319, term3237));
    }

};


