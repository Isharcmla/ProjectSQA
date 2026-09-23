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
import java.lang.Integer;

public class StrBuilder_replaceImpl_1664524742233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7518;
     Object term7577;
     Object term7579;
     Object term7581;
     Object term7595;

    public StrBuilder_replaceImpl_1664524742233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7518 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7519 = (char[]) newCharArray(32);
        setField(term7518, term7518.getClass(), "buffer", term7519);
        setIntField(term7518, term7518.getClass(), "size", 1532716628);
        setField(term7518, term7518.getClass(), "newLine", "LWyEaeIyAo");
        setField(term7518, term7518.getClass(), "nullText", "yVMkkQhvmN");
        term7577 = new Integer(-1801760683);
        term7579 = new Integer(1141317871);
        term7581 = new Integer(890669485);
        term7595 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term7577;
        args[1] = term7579;
        args[2] = term7581;
        args[3] = "mvrkADEgpp";
        args[4] = term7595;
        try {
            callMethod(klass, "replaceImpl", argTypes, term7518, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


