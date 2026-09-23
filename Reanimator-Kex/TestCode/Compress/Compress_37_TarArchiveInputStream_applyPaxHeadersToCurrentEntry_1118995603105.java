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
import java.util.LinkedHashMap;
import java.lang.Object;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_1118995603105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46114;
     Object term46174;
     Object term46576;
     Object term46577;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_1118995603105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46114 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term46174 = new LinkedHashMap();
        ((LinkedHashMap) term46174).put((Object)null, (Object)null);
        term46576 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term46576, term46576.getClass(), "SMALL_BUF", null);
        setIntField(term46576, term46576.getClass(), "recordSize", 0);
        setIntField(term46576, term46576.getClass(), "blockSize", 0);
        setBooleanField(term46576, term46576.getClass(), "hasHitEOF", false);
        setLongField(term46576, term46576.getClass(), "entrySize", 0L);
        setLongField(term46576, term46576.getClass(), "entryOffset", 0L);
        setField(term46576, term46576.getClass(), "is", null);
        setField(term46576, term46576.getClass(), "currEntry", null);
        setField(term46576, term46576.getClass(), "zipEncoding", null);
        setField(term46576, term46576.getClass(), "encoding", null);
        setField(term46576, term46576.getClass(), "globalPaxHeaders", null);
        setField(term46576, term46576.getClass(), "SINGLE", null);
        setLongField(term46576, term46576.getClass(), "bytesRead", 0L);
        term46577 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term46174;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term46114, args);
        assertTrue(recursiveEquals(term46114, term46576));
        assertTrue(recursiveEquals(term46174, term46577));
    }

};


