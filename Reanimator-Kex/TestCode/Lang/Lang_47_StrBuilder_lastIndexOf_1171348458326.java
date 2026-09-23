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
import java.lang.Character;
import java.lang.Integer;

public class StrBuilder_lastIndexOf_1171348458326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13947;
     Object term14006;
     Object term14008;
     Object term95633;

    public StrBuilder_lastIndexOf_1171348458326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13947 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13948 = (char[]) newCharArray(32);
        setField(term13947, term13947.getClass(), "buffer", term13948);
        setIntField(term13947, term13947.getClass(), "size", -1667990367);
        setField(term13947, term13947.getClass(), "newLine", "bnsyeQXFdu");
        setField(term13947, term13947.getClass(), "nullText", "BwtdjiefJn");
        term14006 = new Character('t');
        term14008 = new Integer(-1214628358);
        term95633 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term95634 = (char[]) newCharArray(32);
        setField(term95633, term95633.getClass(), "buffer", term95634);
        setIntField(term95633, term95633.getClass(), "size", -1667990367);
        setField(term95633, term95633.getClass(), "newLine", "bnsyeQXFdu");
        setField(term95633, term95633.getClass(), "nullText", "BwtdjiefJn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term14006;
        args[1] = term14008;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, term13947, args);
        assertTrue(recursiveEquals(term13947, term95633));
        assertTrue(recursiveEquals(term14006, 't'));
        assertTrue(recursiveEquals(term14008, -1214628358));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


