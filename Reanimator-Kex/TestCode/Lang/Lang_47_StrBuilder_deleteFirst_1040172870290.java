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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class StrBuilder_deleteFirst_1040172870290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9737;
     Object term9796;

    public StrBuilder_deleteFirst_1040172870290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9737 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term9738 = (char[]) newCharArray(32);
        setField(term9737, term9737.getClass(), "buffer", term9738);
        setIntField(term9737, term9737.getClass(), "size", 344323424);
        setField(term9737, term9737.getClass(), "newLine", "kVEZMHmRtR");
        setField(term9737, term9737.getClass(), "nullText", "ekxGuOYIwi");
        term9796 = new Character('Z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term9796;
        try {
            callMethod(klass, "deleteFirst", argTypes, term9737, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


