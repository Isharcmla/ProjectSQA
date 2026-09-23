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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_error_946170004139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227586;
     Object enum796;
     Object term228194;
     Object enum798;

    public Tokeniser_error_946170004139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227638 = new ArrayList();
        term227586 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term227708 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term227586, term227586.getClass(), "trackErrors", true);
        setField(term227586, term227586.getClass(), "errors", term227638);
        setIntField(term227708, term227708.getClass(), "pos", -2147483648);
        setIntField(term227708, term227708.getClass(), "length", -2147483648);
        setField(term227586, term227586.getClass(), "reader", term227708);
        Class<? extends Object> term228203 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term228202 = ((Class) term228203).getDeclaredField((String) "ScriptDataDoubleEscapedDash");
        ((Field) term228202).setAccessible(true);
        enum796 = ((Field) term228202).get((Object) null);
        Class<? extends Object> term228446 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term228445 = ((Class) term228446).getDeclaredField((String) "ScriptDataDoubleEscapedDash");
        ((Field) term228445).setAccessible(true);
        Object enum797 = ((Field) term228445).get((Object) null);
        Object term228198 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term228198, term228198.getClass(), "errorMsg", "");
        setIntField(term228198, term228198.getClass(), "pos", -2147483648);
        setCharField(term228198, term228198.getClass(), "c", (char) 65535);
        setField(term228198, term228198.getClass(), "tokeniserState", enum797);
        setField(term228198, term228198.getClass(), "treeBuilderState", null);
        setField(term228198, term228198.getClass(), "token", null);
        ArrayList term228196 = new ArrayList();
        ((ArrayList) term228196).add(term228198);
        term228194 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term228195 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term228195, term228195.getClass(), "input", null);
        setIntField(term228195, term228195.getClass(), "length", -2147483648);
        setIntField(term228195, term228195.getClass(), "pos", -2147483648);
        setIntField(term228195, term228195.getClass(), "mark", 0);
        setField(term228194, term228194.getClass(), "reader", term228195);
        setBooleanField(term228194, term228194.getClass(), "trackErrors", true);
        setField(term228194, term228194.getClass(), "errors", term228196);
        setField(term228194, term228194.getClass(), "state", null);
        setField(term228194, term228194.getClass(), "emitPending", null);
        setBooleanField(term228194, term228194.getClass(), "isEmitPending", false);
        setField(term228194, term228194.getClass(), "charBuffer", null);
        setField(term228194, term228194.getClass(), "dataBuffer", null);
        setField(term228194, term228194.getClass(), "tagPending", null);
        setField(term228194, term228194.getClass(), "doctypePending", null);
        setField(term228194, term228194.getClass(), "commentPending", null);
        setField(term228194, term228194.getClass(), "lastStartTag", null);
        setBooleanField(term228194, term228194.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term228689 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term228688 = ((Class) term228689).getDeclaredField((String) "ScriptDataDoubleEscapedDash");
        ((Field) term228688).setAccessible(true);
        enum798 = ((Field) term228688).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = enum796;
        callMethod(klass, "error", argTypes, term227586, args);
        assertTrue(recursiveEquals(term227586, term228194));
        assertTrue(recursiveEquals(enum796, enum798));
    }

};


