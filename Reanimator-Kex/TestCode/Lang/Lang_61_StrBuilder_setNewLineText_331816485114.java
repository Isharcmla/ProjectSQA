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

public class StrBuilder_setNewLineText_331816485114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term33700;
     Object term33629;

    public StrBuilder_setNewLineText_331816485114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term137 = (char[]) newCharArray(32);
        setField(term136, term136.getClass(), "buffer", term137);
        setIntField(term136, term136.getClass(), "size", 1484323161);
        setField(term136, term136.getClass(), "newLine", "xxtlPwDYFs");
        setField(term136, term136.getClass(), "nullText", "jJCZpVmanW");
        term33700 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term33701 = (char[]) newCharArray(32);
        setField(term33700, term33700.getClass(), "buffer", term33701);
        setIntField(term33700, term33700.getClass(), "size", 1484323161);
        setField(term33700, term33700.getClass(), "newLine", "EGtDIRbSSb");
        setField(term33700, term33700.getClass(), "nullText", "jJCZpVmanW");
        term33629 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term33630 = (char[]) newCharArray(32);
        setField(term33629, term33629.getClass(), "buffer", term33630);
        setIntField(term33629, term33629.getClass(), "size", 1484323161);
        setField(term33629, term33629.getClass(), "newLine", "EGtDIRbSSb");
        setField(term33629, term33629.getClass(), "nullText", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        Object retValue = callMethod(klass, "setNewLineText", argTypes, term136, args);
        assertTrue(recursiveEquals(term136, term33700));
        assertTrue(recursiveEquals(retValue, term33629));
    }

};


