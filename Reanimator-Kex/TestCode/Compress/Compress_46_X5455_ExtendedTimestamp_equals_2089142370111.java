package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class X5455_ExtendedTimestamp_equals_2089142370111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9567;
     Object term9703;
     Object term9717;
     Object term9718;

    public X5455_ExtendedTimestamp_equals_2089142370111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9567 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term9567, term9567.getClass(), "flags", (byte) -124);
        term9703 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term9703, term9703.getClass(), "flags", (byte) 88);
        term9717 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term9717, term9717.getClass(), "flags", (byte) -124);
        setBooleanField(term9717, term9717.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9717, term9717.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9717, term9717.getClass(), "bit2_createTimePresent", false);
        setField(term9717, term9717.getClass(), "modifyTime", null);
        setField(term9717, term9717.getClass(), "accessTime", null);
        setField(term9717, term9717.getClass(), "createTime", null);
        term9718 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term9718, term9718.getClass(), "flags", (byte) 88);
        setBooleanField(term9718, term9718.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9718, term9718.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9718, term9718.getClass(), "bit2_createTimePresent", false);
        setField(term9718, term9718.getClass(), "modifyTime", null);
        setField(term9718, term9718.getClass(), "accessTime", null);
        setField(term9718, term9718.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9703;
        Object retValue = callMethod(klass, "equals", argTypes, term9567, args);
        assertTrue(recursiveEquals(term9567, term9717));
        assertTrue(recursiveEquals(term9703, term9718));
        assertTrue(recursiveEquals(retValue, false));
    }

};


