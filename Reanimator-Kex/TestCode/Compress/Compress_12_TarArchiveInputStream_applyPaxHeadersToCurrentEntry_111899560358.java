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

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180681;
     Object term180741;
     Object term208956;
     Object term208957;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180681 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term180741 = new LinkedHashMap();
        ((LinkedHashMap) term180741).put((Object)null, (Object)null);
        term208956 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term208956, term208956.getClass(), "hasHitEOF", false);
        setLongField(term208956, term208956.getClass(), "entrySize", 0L);
        setLongField(term208956, term208956.getClass(), "entryOffset", 0L);
        setField(term208956, term208956.getClass(), "readBuf", null);
        setField(term208956, term208956.getClass(), "buffer", null);
        setField(term208956, term208956.getClass(), "currEntry", null);
        setField(term208956, term208956.getClass(), "SINGLE", null);
        setLongField(term208956, term208956.getClass(), "bytesRead", 0L);
        term208957 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term180741;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term180681, args);
        assertTrue(recursiveEquals(term180681, term208956));
        assertTrue(recursiveEquals(term180741, term208957));
    }

};


