package org.jsoup.parser;

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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_bufferUp_985249383645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371395;

    public CharacterReader_bufferUp_985249383645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2371395 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term2371445 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term2371395, term2371395.getClass(), "bufPos", -2147483648);
        setIntField(term2371395, term2371395.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term2371395, term2371395.getClass(), "readerPos", 0);
        setField(term2371395, term2371395.getClass(), "reader", term2371445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "bufferUp", argTypes, term2371395, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


