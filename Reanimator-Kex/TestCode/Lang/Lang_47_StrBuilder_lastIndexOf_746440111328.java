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
import java.lang.Integer;

public class StrBuilder_lastIndexOf_746440111328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14195;
     Object term14266;
     Object term96183;

    public StrBuilder_lastIndexOf_746440111328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14195 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14196 = (char[]) newCharArray(32);
        setField(term14195, term14195.getClass(), "buffer", term14196);
        setIntField(term14195, term14195.getClass(), "size", -426764678);
        setField(term14195, term14195.getClass(), "newLine", "GBOEuByOfr");
        setField(term14195, term14195.getClass(), "nullText", "NHbOFFjyVK");
        term14266 = new Integer(-1222614956);
        term96183 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96184 = (char[]) newCharArray(32);
        setField(term96183, term96183.getClass(), "buffer", term96184);
        setIntField(term96183, term96183.getClass(), "size", -426764678);
        setField(term96183, term96183.getClass(), "newLine", "GBOEuByOfr");
        setField(term96183, term96183.getClass(), "nullText", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "zaloBqlrSo";
        args[1] = term14266;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term14195, args);
        assertTrue(recursiveEquals(term14195, term96183));
        assertTrue(recursiveEquals(term14266, -1222614956));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


