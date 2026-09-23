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

public class Tokeniser_consumeCharacterReference_547768274119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215398;
     Object term215485;

    public Tokeniser_consumeCharacterReference_547768274119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215398 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term215468 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term215468, term215468.getClass(), "pos", -2147483648);
        setIntField(term215468, term215468.getClass(), "length", -2147483648);
        setField(term215398, term215398.getClass(), "reader", term215468);
        term215485 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term215486 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term215486, term215486.getClass(), "input", null);
        setIntField(term215486, term215486.getClass(), "length", -2147483648);
        setIntField(term215486, term215486.getClass(), "pos", -2147483648);
        setIntField(term215486, term215486.getClass(), "mark", 0);
        setField(term215485, term215485.getClass(), "reader", term215486);
        setBooleanField(term215485, term215485.getClass(), "trackErrors", false);
        setField(term215485, term215485.getClass(), "errors", null);
        setField(term215485, term215485.getClass(), "state", null);
        setField(term215485, term215485.getClass(), "emitPending", null);
        setBooleanField(term215485, term215485.getClass(), "isEmitPending", false);
        setField(term215485, term215485.getClass(), "charBuffer", null);
        setField(term215485, term215485.getClass(), "dataBuffer", null);
        setField(term215485, term215485.getClass(), "tagPending", null);
        setField(term215485, term215485.getClass(), "doctypePending", null);
        setField(term215485, term215485.getClass(), "commentPending", null);
        setField(term215485, term215485.getClass(), "lastStartTag", null);
        setBooleanField(term215485, term215485.getClass(), "selfClosingFlagAcknowledged", false);
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
        Object retValue = callMethod(klass, "consumeCharacterReference", argTypes, term215398, args);
        assertTrue(recursiveEquals(term215398, term215485));
        assertTrue(recursiveEquals(retValue, null));
    }

};


