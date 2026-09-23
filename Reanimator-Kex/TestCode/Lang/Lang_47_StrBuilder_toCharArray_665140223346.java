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

public class StrBuilder_toCharArray_665140223346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46994;
     Object term100614;
     Object term100611;

    public StrBuilder_toCharArray_665140223346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46994 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term46994, term46994.getClass(), "size", 0);
        term100614 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term100614, term100614.getClass(), "buffer", null);
        setIntField(term100614, term100614.getClass(), "size", 0);
        setField(term100614, term100614.getClass(), "newLine", null);
        setField(term100614, term100614.getClass(), "nullText", null);
        term100611 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toCharArray", argTypes, term46994, args);
        assertTrue(recursiveEquals(term46994, term100614));
        assertTrue(recursiveEquals(retValue, term100611));
    }

};


