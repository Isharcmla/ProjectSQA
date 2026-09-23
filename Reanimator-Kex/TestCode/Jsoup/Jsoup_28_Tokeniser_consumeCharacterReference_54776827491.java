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
import java.lang.Object;

public class Tokeniser_consumeCharacterReference_54776827491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100302;
     Object term100857;

    public Tokeniser_consumeCharacterReference_54776827491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100302 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term100372 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term100372, term100372.getClass(), "pos", -2147483648);
        setIntField(term100372, term100372.getClass(), "length", -2147483648);
        setField(term100302, term100302.getClass(), "reader", term100372);
        term100857 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term100858 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term100858, term100858.getClass(), "input", null);
        setIntField(term100858, term100858.getClass(), "length", -2147483648);
        setIntField(term100858, term100858.getClass(), "pos", -2147483648);
        setIntField(term100858, term100858.getClass(), "mark", 0);
        setField(term100857, term100857.getClass(), "reader", term100858);
        setField(term100857, term100857.getClass(), "errors", null);
        setField(term100857, term100857.getClass(), "state", null);
        setField(term100857, term100857.getClass(), "emitPending", null);
        setBooleanField(term100857, term100857.getClass(), "isEmitPending", false);
        setField(term100857, term100857.getClass(), "charBuffer", null);
        setField(term100857, term100857.getClass(), "dataBuffer", null);
        setField(term100857, term100857.getClass(), "tagPending", null);
        setField(term100857, term100857.getClass(), "doctypePending", null);
        setField(term100857, term100857.getClass(), "commentPending", null);
        setField(term100857, term100857.getClass(), "lastStartTag", null);
        setBooleanField(term100857, term100857.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object retValue = callMethod(klass, "consumeCharacterReference", argTypes, term100302, args);
        assertTrue(recursiveEquals(term100302, term100857));
        assertTrue(recursiveEquals(retValue, null));
    }

};


