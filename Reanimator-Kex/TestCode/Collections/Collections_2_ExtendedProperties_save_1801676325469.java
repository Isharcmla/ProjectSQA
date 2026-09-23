package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class ExtendedProperties_save_1801676325469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138083;
     Object term138185;
     Object term138198;
     Object term138199;

    public ExtendedProperties_save_1801676325469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138083 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term138185 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
        term138198 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term138198, term138198.getClass(), "defaults", null);
        setField(term138198, term138198.getClass(), "file", null);
        setField(term138198, term138198.getClass(), "basePath", null);
        setField(term138198, term138198.getClass(), "fileSeparator", null);
        setBooleanField(term138198, term138198.getClass(), "isInitialized", false);
        setField(term138198, term138198.getClass(), "keysAsListed", null);
        setField(term138198, term138198.getClass(), "table", null);
        setIntField(term138198, term138198.getClass(), "count", 0);
        setIntField(term138198, term138198.getClass(), "threshold", 0);
        setFloatField(term138198, term138198.getClass(), "loadFactor", 0.0F);
        setIntField(term138198, term138198.getClass(), "modCount", 0);
        setField(term138198, term138198.getClass(), "keySet", null);
        setField(term138198, term138198.getClass(), "entrySet", null);
        setField(term138198, term138198.getClass(), "values", null);
        term138199 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
        setField(term138199, term138199.getClass(), "buf", null);
        setField(term138199, term138199.getClass(), "hbuf", null);
        setField(term138199, term138199.getClass(), "cbuf", null);
        setBooleanField(term138199, term138199.getClass(), "blkmode", false);
        setIntField(term138199, term138199.getClass(), "pos", 0);
        setField(term138199, term138199.getClass(), "out", null);
        setField(term138199, term138199.getClass(), "dout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term138185;
        args[1] = null;
        callMethod(klass, "save", argTypes, term138083, args);
        assertTrue(recursiveEquals(term138083, term138198));
        assertTrue(recursiveEquals(term138185, term138199));
    }

};


