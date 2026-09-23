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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_isAppropriateEndTagToken_151432047942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45591;

    public Tokeniser_isAppropriateEndTagToken_151432047942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45609 = new ArrayList();
        Class<? extends Object> term137257 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term137256 = ((Class) term137257).getDeclaredField((String) "ScriptDataEscaped");
        ((Field) term137256).setAccessible(true);
        Object enum571 = ((Field) term137256).get((Object) null);
        Class<? extends Object> term137550 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term137549 = ((Class) term137550).getDeclaredField((String) "Doctype");
        ((Field) term137549).setAccessible(true);
        Object enum572 = ((Field) term137549).get((Object) null);
        Class<? extends Object> term137754 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term137753 = ((Class) term137754).getDeclaredField((String) "Comment");
        ((Field) term137753).setAccessible(true);
        Object enum573 = ((Field) term137753).get((Object) null);
        Class<? extends Object> term137972 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term137971 = ((Class) term137972).getDeclaredField((String) "StartTag");
        ((Field) term137971).setAccessible(true);
        Object enum574 = ((Field) term137971).get((Object) null);
        term45591 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term45592 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term45635 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45636 = (byte[]) newByteArray(16);
        Object term45655 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45656 = (byte[]) newByteArray(16);
        Object term45675 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term45676 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45677 = (byte[]) newByteArray(16);
        Object term45696 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45697 = (byte[]) newByteArray(16);
        Object term45716 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45717 = (byte[]) newByteArray(16);
        Object term45748 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term45749 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term45750 = (byte[]) newByteArray(16);
        Object term45780 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term45818 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term45592, term45592.getClass(), "input", "WzMEhMXkKx");
        setIntField(term45592, term45592.getClass(), "length", -25637976);
        setIntField(term45592, term45592.getClass(), "pos", 1555897383);
        setIntField(term45592, term45592.getClass(), "mark", 202001407);
        setField(term45591, term45591.getClass(), "reader", term45592);
        setBooleanField(term45591, term45591.getClass(), "trackErrors", false);
        setField(term45591, term45591.getClass(), "errors", term45609);
        setField(term45591, term45591.getClass(), "state", enum571);
        setField(term45591, term45591.getClass(), "emitPending", null);
        setBooleanField(term45591, term45591.getClass(), "isEmitPending", false);
        setField(term45635, term45635.getClass(), "value", term45636);
        setByteField(term45635, term45635.getClass(), "coder", (byte) 23);
        setIntField(term45635, term45635.getClass(), "count", 158873461);
        setField(term45591, term45591.getClass(), "charBuffer", term45635);
        setField(term45655, term45655.getClass(), "value", term45656);
        setByteField(term45655, term45655.getClass(), "coder", (byte) -15);
        setIntField(term45655, term45655.getClass(), "count", -430151637);
        setField(term45591, term45591.getClass(), "dataBuffer", term45655);
        setField(term45591, term45591.getClass(), "tagPending", null);
        setField(term45676, term45676.getClass(), "value", term45677);
        setByteField(term45676, term45676.getClass(), "coder", (byte) 0);
        setIntField(term45676, term45676.getClass(), "count", 0);
        setField(term45675, term45675.getClass(), "name", term45676);
        setField(term45696, term45696.getClass(), "value", term45697);
        setByteField(term45696, term45696.getClass(), "coder", (byte) 0);
        setIntField(term45696, term45696.getClass(), "count", 0);
        setField(term45675, term45675.getClass(), "publicIdentifier", term45696);
        setField(term45716, term45716.getClass(), "value", term45717);
        setByteField(term45716, term45716.getClass(), "coder", (byte) 0);
        setIntField(term45716, term45716.getClass(), "count", 0);
        setField(term45675, term45675.getClass(), "systemIdentifier", term45716);
        setBooleanField(term45675, term45675.getClass(), "forceQuirks", false);
        setField(term45675, term45675.getClass(), "type", enum572);
        setField(term45591, term45591.getClass(), "doctypePending", term45675);
        setField(term45749, term45749.getClass(), "value", term45750);
        setByteField(term45749, term45749.getClass(), "coder", (byte) 0);
        setIntField(term45749, term45749.getClass(), "count", 0);
        setField(term45748, term45748.getClass(), "data", term45749);
        setField(term45748, term45748.getClass(), "type", enum573);
        setField(term45591, term45591.getClass(), "commentPending", term45748);
        setField(term45780, term45780.getClass(), "tagName", "XOiDvlDhdc");
        setField(term45780, term45780.getClass(), "pendingAttributeName", "AdxvLJhNLe");
        setField(term45780, term45780.getClass(), "pendingAttributeValue", "lHfTrWKMPk");
        setBooleanField(term45780, term45780.getClass(), "selfClosing", false);
        setField(term45818, term45818.getClass(), "attributes", null);
        setField(term45780, term45780.getClass(), "attributes", term45818);
        setField(term45780, term45780.getClass(), "type", enum574);
        setField(term45591, term45591.getClass(), "lastStartTag", term45780);
        setBooleanField(term45591, term45591.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term45591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


