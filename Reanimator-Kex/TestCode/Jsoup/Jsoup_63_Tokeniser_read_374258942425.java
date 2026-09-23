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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415584;

    public Tokeniser_read_374258942425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term416307 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term416306 = ((Class) term416307).getDeclaredField((String) "ScriptDataEndTagOpen");
        ((Field) term416306).setAccessible(true);
        Object enum611 = ((Field) term416306).get((Object) null);
        term415584 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term415766 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term415812 = newInstance(Class.forName("java.io.StringReader"));
        setBooleanField(term415584, term415584.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term415584, term415584.getClass(), "isEmitPending", false);
        setField(term415584, term415584.getClass(), "state", enum611);
        setIntField(term415766, term415766.getClass(), "bufPos", -2147483647);
        setIntField(term415766, term415766.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term415766, term415766.getClass(), "readerPos", 0);
        setField(term415766, term415766.getClass(), "reader", term415812);
        setField(term415584, term415584.getClass(), "reader", term415766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term415584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


