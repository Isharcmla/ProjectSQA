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

public class StrBuilder_replace_823993189242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8602;
     Object term8673;
     Object term8675;
     Object term8677;

    public StrBuilder_replace_823993189242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8602 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8603 = (char[]) newCharArray(32);
        setField(term8602, term8602.getClass(), "buffer", term8603);
        setIntField(term8602, term8602.getClass(), "size", 53410913);
        setField(term8602, term8602.getClass(), "newLine", "WzFopsaDuG");
        setField(term8602, term8602.getClass(), "nullText", "PapWxkhEWe");
        term8673 = new Integer(-375014958);
        term8675 = new Integer(1107176718);
        term8677 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrMatcher");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "smnHEqRFRx";
        args[2] = term8673;
        args[3] = term8675;
        args[4] = term8677;
        try {
            callMethod(klass, "replace", argTypes, term8602, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


