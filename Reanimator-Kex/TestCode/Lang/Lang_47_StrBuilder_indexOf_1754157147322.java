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

public class StrBuilder_indexOf_1754157147322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13475;
     Object term13546;
     Object term94741;

    public StrBuilder_indexOf_1754157147322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13475 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term13476 = (char[]) newCharArray(32);
        setField(term13475, term13475.getClass(), "buffer", term13476);
        setIntField(term13475, term13475.getClass(), "size", -1899301124);
        setField(term13475, term13475.getClass(), "newLine", "ypEdrstygY");
        setField(term13475, term13475.getClass(), "nullText", "sNQFlATEeQ");
        term13546 = new Integer(-1882480155);
        term94741 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term94742 = (char[]) newCharArray(32);
        setField(term94741, term94741.getClass(), "buffer", term94742);
        setIntField(term94741, term94741.getClass(), "size", -1899301124);
        setField(term94741, term94741.getClass(), "newLine", "ypEdrstygY");
        setField(term94741, term94741.getClass(), "nullText", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "ZKMLioamsY";
        args[1] = term13546;
        Object retValue = callMethod(klass, "indexOf", argTypes, term13475, args);
        assertTrue(recursiveEquals(term13475, term94741));
        assertTrue(recursiveEquals(term13546, -1882480155));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


