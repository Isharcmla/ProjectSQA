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

public class StrBuilder_contains_376347752316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12757;
     Object term12816;
     Object term92962;

    public StrBuilder_contains_376347752316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12757 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12758 = (char[]) newCharArray(32);
        setField(term12757, term12757.getClass(), "buffer", term12758);
        setIntField(term12757, term12757.getClass(), "size", -1970452551);
        setField(term12757, term12757.getClass(), "newLine", "rYbtIDVdnd");
        setField(term12757, term12757.getClass(), "nullText", "UKAReurpHG");
        term12816 = new Character('n');
        term92962 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term92963 = (char[]) newCharArray(32);
        setField(term92962, term92962.getClass(), "buffer", term92963);
        setIntField(term92962, term92962.getClass(), "size", -1970452551);
        setField(term92962, term92962.getClass(), "newLine", "rYbtIDVdnd");
        setField(term92962, term92962.getClass(), "nullText", "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term12816;
        Object retValue = callMethod(klass, "contains", argTypes, term12757, args);
        assertTrue(recursiveEquals(term12757, term92962));
        assertTrue(recursiveEquals(term12816, 'n'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


