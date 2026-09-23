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

public class TokeniserState_readData_208192937742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89379;
     Object term89449;

    public TokeniserState_readData_208192937742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89379 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term89379, term89379.getClass(), "isEmitPending", true);
        term89449 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term89449, term89449.getClass(), "pos", -2147483648);
        setIntField(term89449, term89449.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term89379;
        args[1] = term89449;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "readData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


