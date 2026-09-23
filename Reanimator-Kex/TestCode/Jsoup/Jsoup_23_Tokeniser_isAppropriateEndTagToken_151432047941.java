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
import java.lang.String;

public class Tokeniser_isAppropriateEndTagToken_151432047941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20679;

    public Tokeniser_isAppropriateEndTagToken_151432047941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62295 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term62294 = ((Class) term62295).getDeclaredField((String) "ScriptData");
        ((Field) term62294).setAccessible(true);
        Object enum216 = ((Field) term62294).get((Object) null);
        Class<? extends Object> term62567 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62566 = ((Class) term62567).getDeclaredField((String) "Doctype");
        ((Field) term62566).setAccessible(true);
        Object enum217 = ((Field) term62566).get((Object) null);
        Class<? extends Object> term62771 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62770 = ((Class) term62771).getDeclaredField((String) "Comment");
        ((Field) term62770).setAccessible(true);
        Object enum218 = ((Field) term62770).get((Object) null);
        Class<? extends Object> term62989 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62988 = ((Class) term62989).getDeclaredField((String) "StartTag");
        ((Field) term62988).setAccessible(true);
        Object enum219 = ((Field) term62988).get((Object) null);
        term20679 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term20680 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term20696 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term20715 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20716 = (byte[]) newByteArray(16);
        Object term20735 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20736 = (byte[]) newByteArray(16);
        Object term20755 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term20756 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20757 = (byte[]) newByteArray(16);
        Object term20776 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20777 = (byte[]) newByteArray(16);
        Object term20796 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20797 = (byte[]) newByteArray(16);
        Object term20828 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term20829 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20830 = (byte[]) newByteArray(16);
        Object term20860 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term20898 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20680, term20680.getClass(), "input", "kBdSllIBVz");
        setIntField(term20680, term20680.getClass(), "length", 1240914516);
        setIntField(term20680, term20680.getClass(), "pos", -1465035361);
        setIntField(term20680, term20680.getClass(), "mark", 1090617576);
        setField(term20679, term20679.getClass(), "reader", term20680);
        setIntField(term20696, term20696.getClass(), "maxSize", 0);
        setField(term20696, term20696.getClass(), "elementData", null);
        setIntField(term20696, term20696.getClass(), "size", 0);
        setIntField(term20696, term20696.getClass(), "modCount", 0);
        setField(term20679, term20679.getClass(), "errors", term20696);
        setField(term20679, term20679.getClass(), "state", enum216);
        setField(term20679, term20679.getClass(), "emitPending", null);
        setBooleanField(term20679, term20679.getClass(), "isEmitPending", true);
        setField(term20715, term20715.getClass(), "value", term20716);
        setByteField(term20715, term20715.getClass(), "coder", (byte) 67);
        setIntField(term20715, term20715.getClass(), "count", -1547384488);
        setField(term20679, term20679.getClass(), "charBuffer", term20715);
        setField(term20735, term20735.getClass(), "value", term20736);
        setByteField(term20735, term20735.getClass(), "coder", (byte) 66);
        setIntField(term20735, term20735.getClass(), "count", 1442160736);
        setField(term20679, term20679.getClass(), "dataBuffer", term20735);
        setField(term20679, term20679.getClass(), "tagPending", null);
        setField(term20756, term20756.getClass(), "value", term20757);
        setByteField(term20756, term20756.getClass(), "coder", (byte) 0);
        setIntField(term20756, term20756.getClass(), "count", 0);
        setField(term20755, term20755.getClass(), "name", term20756);
        setField(term20776, term20776.getClass(), "value", term20777);
        setByteField(term20776, term20776.getClass(), "coder", (byte) 0);
        setIntField(term20776, term20776.getClass(), "count", 0);
        setField(term20755, term20755.getClass(), "publicIdentifier", term20776);
        setField(term20796, term20796.getClass(), "value", term20797);
        setByteField(term20796, term20796.getClass(), "coder", (byte) 0);
        setIntField(term20796, term20796.getClass(), "count", 0);
        setField(term20755, term20755.getClass(), "systemIdentifier", term20796);
        setBooleanField(term20755, term20755.getClass(), "forceQuirks", true);
        setField(term20755, term20755.getClass(), "type", enum217);
        setField(term20679, term20679.getClass(), "doctypePending", term20755);
        setField(term20829, term20829.getClass(), "value", term20830);
        setByteField(term20829, term20829.getClass(), "coder", (byte) 0);
        setIntField(term20829, term20829.getClass(), "count", 0);
        setField(term20828, term20828.getClass(), "data", term20829);
        setField(term20828, term20828.getClass(), "type", enum218);
        setField(term20679, term20679.getClass(), "commentPending", term20828);
        setField(term20860, term20860.getClass(), "tagName", "TJmVBGfTML");
        setField(term20860, term20860.getClass(), "pendingAttributeName", "tPlsykYBqO");
        setField(term20860, term20860.getClass(), "pendingAttributeValue", "bLPjGVBhlX");
        setBooleanField(term20860, term20860.getClass(), "selfClosing", true);
        setField(term20898, term20898.getClass(), "attributes", null);
        setField(term20860, term20860.getClass(), "attributes", term20898);
        setField(term20860, term20860.getClass(), "type", enum219);
        setField(term20679, term20679.getClass(), "lastStartTag", term20860);
        setBooleanField(term20679, term20679.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isAppropriateEndTagToken", argTypes, term20679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


