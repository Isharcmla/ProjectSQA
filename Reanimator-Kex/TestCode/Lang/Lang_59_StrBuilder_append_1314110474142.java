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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StrBuilder_append_1314110474142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2687;
     Object term2758;
     Object term2760;

    public StrBuilder_append_1314110474142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2687 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term2688 = (char[]) newCharArray(32);
        setField(term2687, term2687.getClass(), "buffer", term2688);
        setIntField(term2687, term2687.getClass(), "size", 1193880199);
        setField(term2687, term2687.getClass(), "newLine", "nGKItKLYNC");
        setField(term2687, term2687.getClass(), "nullText", "UiUYnPrcCi");
        term2758 = new Integer(-1087774327);
        term2760 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "UoYtihxVaS";
        args[1] = term2758;
        args[2] = term2760;
        try {
            callMethod(klass, "append", argTypes, term2687, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


