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

public class Tokeniser_read_374258942327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291524;

    public Tokeniser_read_374258942327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292249 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term292248 = ((Class) term292249).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term292248).setAccessible(true);
        Object enum537 = ((Field) term292248).get((Object) null);
        term291524 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term291706 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term291019 = (char[]) newCharArray(0);
        setBooleanField(term291524, term291524.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term291524, term291524.getClass(), "isEmitPending", false);
        setField(term291524, term291524.getClass(), "state", enum537);
        setIntField(term291706, term291706.getClass(), "bufPos", -2147483648);
        setIntField(term291706, term291706.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term291706, term291706.getClass(), "bufLength", -2147483647);
        setField(term291706, term291706.getClass(), "charBuf", term291019);
        setField(term291524, term291524.getClass(), "reader", term291706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term291524, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


