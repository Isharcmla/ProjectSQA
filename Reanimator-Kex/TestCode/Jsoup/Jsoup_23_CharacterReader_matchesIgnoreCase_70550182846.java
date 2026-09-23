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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_matchesIgnoreCase_70550182846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;
     Object term4249;

    public CharacterReader_matchesIgnoreCase_70550182846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term550, term550.getClass(), "input", "RkybSrpybU");
        setIntField(term550, term550.getClass(), "length", -1048298087);
        setIntField(term550, term550.getClass(), "pos", 292681826);
        setIntField(term550, term550.getClass(), "mark", 458147407);
        term4249 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4249, term4249.getClass(), "input", "RkybSrpybU");
        setIntField(term4249, term4249.getClass(), "length", -1048298087);
        setIntField(term4249, term4249.getClass(), "pos", 292681826);
        setIntField(term4249, term4249.getClass(), "mark", 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "matchesIgnoreCase", argTypes, term550, args);
        assertTrue(recursiveEquals(term550, term4249));
    }

};


