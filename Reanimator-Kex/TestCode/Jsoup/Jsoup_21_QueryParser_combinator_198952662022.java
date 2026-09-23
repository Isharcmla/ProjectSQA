package org.jsoup.select;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Character;

public class QueryParser_combinator_198952662022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term127;

    public QueryParser_combinator_198952662022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123 = new ArrayList();
        ((ArrayList) term123).add((Object)null);
        ((ArrayList) term123).add((Object)null);
        ((ArrayList) term123).add((Object)null);
        ((ArrayList) term123).add((Object)null);
        term96 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term97 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term97, term97.getClass(), "queue", "jJCZpVmanW");
        setIntField(term97, term97.getClass(), "pos", 1162663216);
        setField(term96, term96.getClass(), "tq", term97);
        setField(term96, term96.getClass(), "query", "EGtDIRbSSb");
        setField(term96, term96.getClass(), "evals", term123);
        term127 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term127;
        try {
            callMethod(klass, "combinator", argTypes, term96, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


