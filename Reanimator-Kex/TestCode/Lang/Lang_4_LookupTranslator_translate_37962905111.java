package org.apache.commons.lang3.text.translate;

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
import static org.apache.commons.lang3.text.translate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class LookupTranslator_translate_37962905111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633;

    public LookupTranslator_translate_37962905111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1681 = new HashMap();
        term1633 = newInstance(Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator"));
        setIntField(term1633, term1633.getClass(), "longest", -2147483648);
        setIntField(term1633, term1633.getClass(), "shortest", -2147483648);
        setField(term1633, term1633.getClass(), "lookupMap", term1681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.translate.LookupTranslator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Writer");
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = -2147483648;
        args[2] = null;
        try {
            callMethod(klass, "translate", argTypes, term1633, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


