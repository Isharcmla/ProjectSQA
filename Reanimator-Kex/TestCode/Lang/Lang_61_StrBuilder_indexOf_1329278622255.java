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

public class StrBuilder_indexOf_1329278622255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10294;
     Object term10353;
     Object term78705;

    public StrBuilder_indexOf_1329278622255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10294 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10295 = (char[]) newCharArray(32);
        setField(term10294, term10294.getClass(), "buffer", term10295);
        setIntField(term10294, term10294.getClass(), "size", -1388471422);
        setField(term10294, term10294.getClass(), "newLine", "kGMQdqJYyB");
        setField(term10294, term10294.getClass(), "nullText", "XJJNClzHRf");
        term10353 = new Character('s');
        term78705 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term78706 = (char[]) newCharArray(32);
        setField(term78705, term78705.getClass(), "buffer", term78706);
        setIntField(term78705, term78705.getClass(), "size", -1388471422);
        setField(term78705, term78705.getClass(), "newLine", "kGMQdqJYyB");
        setField(term78705, term78705.getClass(), "nullText", "XJJNClzHRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term10353;
        Object retValue = callMethod(klass, "indexOf", argTypes, term10294, args);
        assertTrue(recursiveEquals(term10294, term78705));
        assertTrue(recursiveEquals(term10353, 's'));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


