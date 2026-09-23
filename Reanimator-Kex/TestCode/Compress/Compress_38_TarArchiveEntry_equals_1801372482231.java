package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;

public class TarArchiveEntry_equals_1801372482231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71874;
     Object term71956;
     Object term71977;
     Object term71978;

    public TarArchiveEntry_equals_1801372482231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71874 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term71956 = newInstance(Class.forName("java.util.stream.ReferencePipeline$8$1"));
        term71977 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term71977, term71977.getClass(), "name", null);
        setBooleanField(term71977, term71977.getClass(), "preserveLeadingSlashes", false);
        setIntField(term71977, term71977.getClass(), "mode", 0);
        setLongField(term71977, term71977.getClass(), "userId", 0L);
        setLongField(term71977, term71977.getClass(), "groupId", 0L);
        setLongField(term71977, term71977.getClass(), "size", 0L);
        setLongField(term71977, term71977.getClass(), "modTime", 0L);
        setBooleanField(term71977, term71977.getClass(), "checkSumOK", false);
        setByteField(term71977, term71977.getClass(), "linkFlag", (byte) 0);
        setField(term71977, term71977.getClass(), "linkName", null);
        setField(term71977, term71977.getClass(), "magic", null);
        setField(term71977, term71977.getClass(), "version", null);
        setField(term71977, term71977.getClass(), "userName", null);
        setField(term71977, term71977.getClass(), "groupName", null);
        setIntField(term71977, term71977.getClass(), "devMajor", 0);
        setIntField(term71977, term71977.getClass(), "devMinor", 0);
        setBooleanField(term71977, term71977.getClass(), "isExtended", false);
        setLongField(term71977, term71977.getClass(), "realSize", 0L);
        setBooleanField(term71977, term71977.getClass(), "paxGNUSparse", false);
        setBooleanField(term71977, term71977.getClass(), "starSparse", false);
        setField(term71977, term71977.getClass(), "file", null);
        term71978 = newInstance(Class.forName("java.util.stream.ReferencePipeline$8$1"));
        setBooleanField(term71978, term71978.getClass(), "cancellationRequestedCalled", false);
        setField(term71978, term71978.getClass(), "downstreamAsInt", null);
        setField(term71978, term71978.getClass(), "this$1", null);
        setField(term71978, term71978.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71956;
        Object retValue = callMethod(klass, "equals", argTypes, term71874, args);
        assertTrue(recursiveEquals(term71874, term71977));
        assertTrue(recursiveEquals(term71956, term71978));
        assertTrue(recursiveEquals(retValue, false));
    }

};


