package org.apache.commons.lang.text;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_replaceFirst_1238446619302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11001;

    public StrBuilder_replaceFirst_1238446619302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11001 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11002 = (char[]) newCharArray(32);
        setField(term11001, term11001.getClass(), "buffer", term11002);
        setIntField(term11001, term11001.getClass(), "size", 1953277050);
        setField(term11001, term11001.getClass(), "newLine", "RMsXuyzKJV");
        setField(term11001, term11001.getClass(), "nullText", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hOncybyCAH";
        args[1] = "QduALnDSVo";
        try {
            callMethod(klass, "replaceFirst", argTypes, term11001, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


