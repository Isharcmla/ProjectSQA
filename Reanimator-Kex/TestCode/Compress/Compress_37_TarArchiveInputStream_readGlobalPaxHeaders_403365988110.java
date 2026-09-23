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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class TarArchiveInputStream_readGlobalPaxHeaders_403365988110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46941;

    public TarArchiveInputStream_readGlobalPaxHeaders_403365988110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46989 = new HashMap();
        term46941 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term46764 = (byte[]) newByteArray(0);
        Object term47109 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term47139 = newInstance(Class.forName("java.io.File"));
        setField(term46941, term46941.getClass(), "globalPaxHeaders", term46989);
        setField(term46941, term46941.getClass(), "SINGLE", term46764);
        setBooleanField(term46941, term46941.getClass(), "hasHitEOF", false);
        setField(term47109, term47109.getClass(), "file", term47139);
        setField(term46941, term46941.getClass(), "currEntry", term47109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readGlobalPaxHeaders", argTypes, term46941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


