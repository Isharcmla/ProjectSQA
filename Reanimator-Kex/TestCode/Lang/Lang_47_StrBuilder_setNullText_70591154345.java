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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_setNullText_70591154345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45040;
     Object term100506;
     Object term100502;

    public StrBuilder_setNullText_70591154345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45040 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term100506 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term100506, term100506.getClass(), "buffer", null);
        setIntField(term100506, term100506.getClass(), "size", 0);
        setField(term100506, term100506.getClass(), "newLine", null);
        setField(term100506, term100506.getClass(), "nullText", null);
        term100502 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term100502, term100502.getClass(), "buffer", null);
        setIntField(term100502, term100502.getClass(), "size", 0);
        setField(term100502, term100502.getClass(), "newLine", null);
        setField(term100502, term100502.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "setNullText", argTypes, term45040, args);
        assertTrue(recursiveEquals(term45040, term100506));
        assertTrue(recursiveEquals(retValue, term100502));
    }

};


