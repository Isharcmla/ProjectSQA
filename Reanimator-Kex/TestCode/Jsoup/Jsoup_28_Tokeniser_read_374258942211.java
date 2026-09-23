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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191835;

    public Tokeniser_read_374258942211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192576 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term192575 = ((Class) term192576).getDeclaredField((String) "ScriptDataEscapedEndTagOpen");
        ((Field) term192575).setAccessible(true);
        Object enum354 = ((Field) term192575).get((Object) null);
        term191835 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term192017 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term191537 = (char[]) newCharArray(2);
        setBooleanField(term191835, term191835.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term191835, term191835.getClass(), "isEmitPending", false);
        setField(term191835, term191835.getClass(), "state", enum354);
        setIntField(term192017, term192017.getClass(), "pos", -2147483648);
        setIntField(term192017, term192017.getClass(), "length", -2147483647);
        setField(term192017, term192017.getClass(), "input", term191537);
        setField(term191835, term191835.getClass(), "reader", term192017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term191835, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


