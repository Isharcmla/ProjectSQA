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

public class StrBuilder_deleteFirst_1040172870225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6917;
     Object term6976;
     Object term69522;
     Object term69462;

    public StrBuilder_deleteFirst_1040172870225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6917 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term6918 = (char[]) newCharArray(32);
        setField(term6917, term6917.getClass(), "buffer", term6918);
        setIntField(term6917, term6917.getClass(), "size", -663691365);
        setField(term6917, term6917.getClass(), "newLine", "xIeFjkHkOe");
        setField(term6917, term6917.getClass(), "nullText", "SdCKLMIYnX");
        term6976 = new Character('l');
        term69522 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term69523 = (char[]) newCharArray(32);
        setField(term69522, term69522.getClass(), "buffer", term69523);
        setIntField(term69522, term69522.getClass(), "size", -663691365);
        setField(term69522, term69522.getClass(), "newLine", "xIeFjkHkOe");
        setField(term69522, term69522.getClass(), "nullText", "SdCKLMIYnX");
        term69462 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term69463 = (char[]) newCharArray(32);
        setField(term69462, term69462.getClass(), "buffer", term69463);
        setIntField(term69462, term69462.getClass(), "size", -663691365);
        setField(term69462, term69462.getClass(), "newLine", "xIeFjkHkOe");
        setField(term69462, term69462.getClass(), "nullText", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term6976;
        Object retValue = callMethod(klass, "deleteFirst", argTypes, term6917, args);
        assertTrue(recursiveEquals(term6917, term69522));
        assertTrue(recursiveEquals(term6976, 'l'));
        assertTrue(recursiveEquals(retValue, term69462));
    }

};


