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

public class CharacterReader_matches_186207884245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502;
     Object term4172;

    public CharacterReader_matches_186207884245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term502 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term502, term502.getClass(), "input", "pCTimMblYc");
        setIntField(term502, term502.getClass(), "length", 454281060);
        setIntField(term502, term502.getClass(), "pos", -1786399638);
        setIntField(term502, term502.getClass(), "mark", 2055867847);
        term4172 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4172, term4172.getClass(), "input", "pCTimMblYc");
        setIntField(term4172, term4172.getClass(), "length", 454281060);
        setIntField(term4172, term4172.getClass(), "pos", -1786399638);
        setIntField(term4172, term4172.getClass(), "mark", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "matches", argTypes, term502, args);
        assertTrue(recursiveEquals(term502, term4172));
    }

};


