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
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public class Tokeniser_read_374258942221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326664;
     Object term327283;
     Object term327154;

    public Tokeniser_read_374258942221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327295 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term327294 = ((Class) term327295).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term327294).setAccessible(true);
        Object enum893 = ((Field) term327294).get((Object) null);
        StringBuilder term326904 = new StringBuilder();
        term326664 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term326844 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term326664, term326664.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term326664, term326664.getClass(), "isEmitPending", false);
        setField(term326664, term326664.getClass(), "state", enum893);
        setIntField(term326844, term326844.getClass(), "pos", -2147483648);
        setIntField(term326844, term326844.getClass(), "length", -2147483648);
        setField(term326664, term326664.getClass(), "reader", term326844);
        setField(term326664, term326664.getClass(), "charBuffer", term326904);
        Class<? extends Object> term327520 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term327519 = ((Class) term327520).getDeclaredField((String) "Data");
        ((Field) term327519).setAccessible(true);
        Object enum894 = ((Field) term327519).get((Object) null);
        Class<? extends Object> term327694 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term327693 = ((Class) term327694).getDeclaredField((String) "EOF");
        ((Field) term327693).setAccessible(true);
        Object enum895 = ((Field) term327693).get((Object) null);
        term327283 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term327284 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term327288 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Object term327292 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term327293 = (byte[]) newByteArray(16);
        setField(term327284, term327284.getClass(), "input", null);
        setIntField(term327284, term327284.getClass(), "length", -2147483648);
        setIntField(term327284, term327284.getClass(), "pos", -2147483648);
        setIntField(term327284, term327284.getClass(), "mark", 0);
        setField(term327283, term327283.getClass(), "reader", term327284);
        setBooleanField(term327283, term327283.getClass(), "trackErrors", false);
        setField(term327283, term327283.getClass(), "errors", null);
        setField(term327283, term327283.getClass(), "state", enum894);
        setField(term327288, term327288.getClass(), "type", enum895);
        setField(term327283, term327283.getClass(), "emitPending", term327288);
        setBooleanField(term327283, term327283.getClass(), "isEmitPending", false);
        setField(term327292, term327292.getClass(), "value", term327293);
        setByteField(term327292, term327292.getClass(), "coder", (byte) 0);
        setIntField(term327292, term327292.getClass(), "count", 0);
        setField(term327283, term327283.getClass(), "charBuffer", term327292);
        setField(term327283, term327283.getClass(), "dataBuffer", null);
        setField(term327283, term327283.getClass(), "tagPending", null);
        setField(term327283, term327283.getClass(), "doctypePending", null);
        setField(term327283, term327283.getClass(), "commentPending", null);
        setField(term327283, term327283.getClass(), "lastStartTag", null);
        setBooleanField(term327283, term327283.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term327886 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term327885 = ((Class) term327886).getDeclaredField((String) "EOF");
        ((Field) term327885).setAccessible(true);
        Object enum896 = ((Field) term327885).get((Object) null);
        term327154 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term327154, term327154.getClass(), "type", enum896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term326664, args);
        assertTrue(recursiveEquals(term326664, term327283));
        assertTrue(recursiveEquals(retValue, term327154));
    }

};


