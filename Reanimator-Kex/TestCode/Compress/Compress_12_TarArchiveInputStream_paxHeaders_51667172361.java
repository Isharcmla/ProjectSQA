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

public class TarArchiveInputStream_paxHeaders_51667172361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210732;

    public TarArchiveInputStream_paxHeaders_51667172361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210732 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term210732, term210732.getClass(), "hasHitEOF", false);
        setField(term210732, term210732.getClass(), "currEntry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term210732, args);
    }

};


