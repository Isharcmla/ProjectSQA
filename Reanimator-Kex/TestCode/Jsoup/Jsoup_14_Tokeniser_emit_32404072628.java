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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_emit_32404072628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9010;

    public Tokeniser_emit_32404072628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75348 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term75347 = ((Class) term75348).getDeclaredField((String) "ScriptDataEndTagOpen");
        ((Field) term75347).setAccessible(true);
        Object enum306 = ((Field) term75347).get((Object) null);
        Class<? extends Object> term75570 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term75569 = ((Class) term75570).getDeclaredField((String) "InSelect");
        ((Field) term75569).setAccessible(true);
        Object enum307 = ((Field) term75569).get((Object) null);
        Object term9030 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term9030, term9030.getClass(), "errorMsg", "");
        setIntField(term9030, term9030.getClass(), "pos", -1275173084);
        setCharField(term9030, term9030.getClass(), "c", 'A');
        setField(term9030, term9030.getClass(), "tokeniserState", enum306);
        setField(term9030, term9030.getClass(), "treeBuilderState", enum307);
        setField(term9030, term9030.getClass(), "token", null);
        ArrayList term9028 = new ArrayList();
        ((ArrayList) term9028).add(term9030);
        Class<? extends Object> term75766 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term75765 = ((Class) term75766).getDeclaredField((String) "TagName");
        ((Field) term75765).setAccessible(true);
        Object enum308 = ((Field) term75765).get((Object) null);
        Class<? extends Object> term76029 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term76028 = ((Class) term76029).getDeclaredField((String) "Doctype");
        ((Field) term76028).setAccessible(true);
        Object enum309 = ((Field) term76028).get((Object) null);
        Class<? extends Object> term76233 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term76232 = ((Class) term76233).getDeclaredField((String) "Comment");
        ((Field) term76232).setAccessible(true);
        Object enum310 = ((Field) term76232).get((Object) null);
        Class<? extends Object> term76451 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term76450 = ((Class) term76451).getDeclaredField((String) "StartTag");
        ((Field) term76450).setAccessible(true);
        Object enum311 = ((Field) term76450).get((Object) null);
        term9010 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term9011 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term9052 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9053 = (byte[]) newByteArray(16);
        Object term9072 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9073 = (byte[]) newByteArray(16);
        Object term9092 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term9093 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9094 = (byte[]) newByteArray(16);
        Object term9113 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9114 = (byte[]) newByteArray(16);
        Object term9133 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9134 = (byte[]) newByteArray(16);
        Object term9165 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term9166 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9167 = (byte[]) newByteArray(16);
        Object term9197 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term9235 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9011, term9011.getClass(), "input", "hNxWaHcfhY");
        setIntField(term9011, term9011.getClass(), "length", 1135664017);
        setIntField(term9011, term9011.getClass(), "pos", 590364439);
        setIntField(term9011, term9011.getClass(), "mark", 865208305);
        setField(term9010, term9010.getClass(), "reader", term9011);
        setBooleanField(term9010, term9010.getClass(), "trackErrors", true);
        setField(term9010, term9010.getClass(), "errors", term9028);
        setField(term9010, term9010.getClass(), "state", enum308);
        setField(term9010, term9010.getClass(), "emitPending", null);
        setBooleanField(term9010, term9010.getClass(), "isEmitPending", true);
        setField(term9052, term9052.getClass(), "value", term9053);
        setByteField(term9052, term9052.getClass(), "coder", (byte) 89);
        setIntField(term9052, term9052.getClass(), "count", -244121226);
        setField(term9010, term9010.getClass(), "charBuffer", term9052);
        setField(term9072, term9072.getClass(), "value", term9073);
        setByteField(term9072, term9072.getClass(), "coder", (byte) 75);
        setIntField(term9072, term9072.getClass(), "count", -203030934);
        setField(term9010, term9010.getClass(), "dataBuffer", term9072);
        setField(term9010, term9010.getClass(), "tagPending", null);
        setField(term9093, term9093.getClass(), "value", term9094);
        setByteField(term9093, term9093.getClass(), "coder", (byte) 0);
        setIntField(term9093, term9093.getClass(), "count", 0);
        setField(term9092, term9092.getClass(), "name", term9093);
        setField(term9113, term9113.getClass(), "value", term9114);
        setByteField(term9113, term9113.getClass(), "coder", (byte) 0);
        setIntField(term9113, term9113.getClass(), "count", 0);
        setField(term9092, term9092.getClass(), "publicIdentifier", term9113);
        setField(term9133, term9133.getClass(), "value", term9134);
        setByteField(term9133, term9133.getClass(), "coder", (byte) 0);
        setIntField(term9133, term9133.getClass(), "count", 0);
        setField(term9092, term9092.getClass(), "systemIdentifier", term9133);
        setBooleanField(term9092, term9092.getClass(), "forceQuirks", false);
        setField(term9092, term9092.getClass(), "type", enum309);
        setField(term9010, term9010.getClass(), "doctypePending", term9092);
        setField(term9166, term9166.getClass(), "value", term9167);
        setByteField(term9166, term9166.getClass(), "coder", (byte) 0);
        setIntField(term9166, term9166.getClass(), "count", 0);
        setField(term9165, term9165.getClass(), "data", term9166);
        setField(term9165, term9165.getClass(), "type", enum310);
        setField(term9010, term9010.getClass(), "commentPending", term9165);
        setField(term9197, term9197.getClass(), "tagName", "xOEqzGAmDU");
        setField(term9197, term9197.getClass(), "pendingAttributeName", "eZFUvlxvGV");
        setField(term9197, term9197.getClass(), "pendingAttributeValue", "BYqFIqCKAV");
        setBooleanField(term9197, term9197.getClass(), "selfClosing", true);
        setField(term9235, term9235.getClass(), "attributes", null);
        setField(term9197, term9197.getClass(), "attributes", term9235);
        setField(term9197, term9197.getClass(), "type", enum311);
        setField(term9010, term9010.getClass(), "lastStartTag", term9197);
        setBooleanField(term9010, term9010.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        try {
            callMethod(klass, "emit", argTypes, term9010, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


