package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class ZoneInfoCompiler_writeZoneInfoMap_43750604722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term125;

    public ZoneInfoCompiler_writeZoneInfoMap_43750604722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term114 = (byte[]) newByteArray(4);
        byte[] term119 = (byte[]) newByteArray(3);
        Object term124 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term112, term112.getClass(), "written", 568599855);
        setByteElement(term114, 0, (byte) 47);
        setByteElement(term114, 1, (byte) 48);
        setByteElement(term114, 2, (byte) 89);
        setByteElement(term114, 3, (byte) 75);
        setField(term112, term112.getClass(), "bytearr", term114);
        setByteElement(term119, 0, (byte) 18);
        setByteElement(term119, 1, (byte) -58);
        setByteElement(term119, 2, (byte) -29);
        setField(term112, term112.getClass(), "writeBuffer", term119);
        setField(term112, term112.getClass(), "out", null);
        setBooleanField(term112, term112.getClass(), "closed", false);
        setField(term112, term112.getClass(), "closeLock", term124);
        term125 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term112;
        args[1] = term125;
        try {
            callMethod(klass, "writeZoneInfoMap", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


