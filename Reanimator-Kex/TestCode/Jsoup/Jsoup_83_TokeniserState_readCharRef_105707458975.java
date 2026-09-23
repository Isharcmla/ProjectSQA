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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TokeniserState_readCharRef_105707458975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120785;

    public TokeniserState_readCharRef_105707458975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120785 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term120855 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term120684 = (char[]) newCharArray(0);
        setIntField(term120855, term120855.getClass(), "bufPos", -2147483648);
        setIntField(term120855, term120855.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term120855, term120855.getClass(), "bufLength", -2147483647);
        setField(term120855, term120855.getClass(), "charBuf", term120684);
        setField(term120785, term120785.getClass(), "reader", term120855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term120785;
        args[1] = null;
        try {
            callMethod(klass, "readCharRef", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


