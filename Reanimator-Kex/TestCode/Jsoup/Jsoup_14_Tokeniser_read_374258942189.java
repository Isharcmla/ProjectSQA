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

public class Tokeniser_read_374258942189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279119;
     Object term279729;
     Object term279603;

    public Tokeniser_read_374258942189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term279741 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term279740 = ((Class) term279741).getDeclaredField((String) "AfterAttributeName");
        ((Field) term279740).setAccessible(true);
        Object enum847 = ((Field) term279740).get((Object) null);
        StringBuilder term279361 = new StringBuilder();
        term279119 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term279301 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term279119, term279119.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term279119, term279119.getClass(), "isEmitPending", false);
        setField(term279119, term279119.getClass(), "state", enum847);
        setIntField(term279301, term279301.getClass(), "pos", -2147483648);
        setIntField(term279301, term279301.getClass(), "length", -2147483648);
        setField(term279119, term279119.getClass(), "reader", term279301);
        setField(term279119, term279119.getClass(), "charBuffer", term279361);
        Class<? extends Object> term279957 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term279956 = ((Class) term279957).getDeclaredField((String) "Data");
        ((Field) term279956).setAccessible(true);
        Object enum848 = ((Field) term279956).get((Object) null);
        Class<? extends Object> term280131 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term280130 = ((Class) term280131).getDeclaredField((String) "EOF");
        ((Field) term280130).setAccessible(true);
        Object enum849 = ((Field) term280130).get((Object) null);
        term279729 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term279730 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term279734 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Object term279738 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term279739 = (byte[]) newByteArray(16);
        setField(term279730, term279730.getClass(), "input", null);
        setIntField(term279730, term279730.getClass(), "length", -2147483648);
        setIntField(term279730, term279730.getClass(), "pos", -2147483648);
        setIntField(term279730, term279730.getClass(), "mark", 0);
        setField(term279729, term279729.getClass(), "reader", term279730);
        setBooleanField(term279729, term279729.getClass(), "trackErrors", false);
        setField(term279729, term279729.getClass(), "errors", null);
        setField(term279729, term279729.getClass(), "state", enum848);
        setField(term279734, term279734.getClass(), "type", enum849);
        setField(term279729, term279729.getClass(), "emitPending", term279734);
        setBooleanField(term279729, term279729.getClass(), "isEmitPending", false);
        setField(term279738, term279738.getClass(), "value", term279739);
        setByteField(term279738, term279738.getClass(), "coder", (byte) 0);
        setIntField(term279738, term279738.getClass(), "count", 0);
        setField(term279729, term279729.getClass(), "charBuffer", term279738);
        setField(term279729, term279729.getClass(), "dataBuffer", null);
        setField(term279729, term279729.getClass(), "tagPending", null);
        setField(term279729, term279729.getClass(), "doctypePending", null);
        setField(term279729, term279729.getClass(), "commentPending", null);
        setField(term279729, term279729.getClass(), "lastStartTag", null);
        setBooleanField(term279729, term279729.getClass(), "selfClosingFlagAcknowledged", true);
        Class<? extends Object> term280323 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term280322 = ((Class) term280323).getDeclaredField((String) "EOF");
        ((Field) term280322).setAccessible(true);
        Object enum850 = ((Field) term280322).get((Object) null);
        term279603 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term279603, term279603.getClass(), "type", enum850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term279119, args);
        assertTrue(recursiveEquals(term279119, term279729));
        assertTrue(recursiveEquals(retValue, term279603));
    }

};


