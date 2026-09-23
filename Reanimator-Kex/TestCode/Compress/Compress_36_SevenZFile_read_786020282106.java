package org.apache.commons.compress.archivers.sevenz;

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
import java.lang.ClassCastException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SevenZFile_read_786020282106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39463;

    public SevenZFile_read_786020282106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39631 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        ArrayList term39515 = new ArrayList();
        ((ArrayList) term39515).add(term39631);
        ((ArrayList) term39515).add((Object)null);
        ((ArrayList) term39515).add((Object)null);
        ((ArrayList) term39515).add((Object)null);
        term39463 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        setField(term39463, term39463.getClass(), "deferredBlockStreams", term39515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term39463, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


