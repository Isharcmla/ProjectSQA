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

public class StrBuilder_toCharArray_665140223288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46904;
     Object term90175;
     Object term90172;

    public StrBuilder_toCharArray_665140223288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46904 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term46904, term46904.getClass(), "size", 0);
        term90175 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term90175, term90175.getClass(), "buffer", null);
        setIntField(term90175, term90175.getClass(), "size", 0);
        setField(term90175, term90175.getClass(), "newLine", null);
        setField(term90175, term90175.getClass(), "nullText", null);
        term90172 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toCharArray", argTypes, term46904, args);
        assertTrue(recursiveEquals(term46904, term90175));
        assertTrue(recursiveEquals(retValue, term90172));
    }

};


