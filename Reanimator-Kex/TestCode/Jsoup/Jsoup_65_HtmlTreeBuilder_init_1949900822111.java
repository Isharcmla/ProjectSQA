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
import java.lang.String;

public class HtmlTreeBuilder_init_1949900822111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104949;

    public HtmlTreeBuilder_init_1949900822111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104983 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term104982 = ((Class) term104983).getDeclaredField((String) "StartTag");
        ((Field) term104982).setAccessible(true);
        Object enum301 = ((Field) term104982).get((Object) null);
        Class<? extends Object> term105190 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term105189 = ((Class) term105190).getDeclaredField((String) "EndTag");
        ((Field) term105189).setAccessible(true);
        Object enum302 = ((Field) term105189).get((Object) null);
        term104949 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term104950 = (Object[]) newArray("java.lang.String", 1);
        Object term104951 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term104952 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term104953 = (byte[]) newByteArray(16);
        Object term104954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term104955 = (Object[]) newArray("java.lang.String", 0);
        Object[] term104956 = (Object[]) newArray("java.lang.String", 0);
        Object term104960 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term104961 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term104962 = (byte[]) newByteArray(16);
        setField(term104949, term104949.getClass(), "state", null);
        setField(term104949, term104949.getClass(), "originalState", null);
        setBooleanField(term104949, term104949.getClass(), "baseUriSetFromDoc", false);
        setField(term104949, term104949.getClass(), "headElement", null);
        setField(term104949, term104949.getClass(), "formElement", null);
        setField(term104949, term104949.getClass(), "contextElement", null);
        setField(term104949, term104949.getClass(), "formattingElements", null);
        setField(term104949, term104949.getClass(), "pendingTableCharacters", null);
        setField(term104949, term104949.getClass(), "emptyEnd", null);
        setBooleanField(term104949, term104949.getClass(), "framesetOk", false);
        setBooleanField(term104949, term104949.getClass(), "fosterInserts", false);
        setBooleanField(term104949, term104949.getClass(), "fragmentParsing", false);
        setField(term104949, term104949.getClass(), "specificScopeTarget", term104950);
        setField(term104949, term104949.getClass(), "reader", null);
        setField(term104949, term104949.getClass(), "tokeniser", null);
        setField(term104949, term104949.getClass(), "doc", null);
        setField(term104949, term104949.getClass(), "stack", null);
        setField(term104949, term104949.getClass(), "baseUri", null);
        setField(term104949, term104949.getClass(), "currentToken", null);
        setField(term104949, term104949.getClass(), "errors", null);
        setField(term104949, term104949.getClass(), "settings", null);
        setField(term104951, term104951.getClass(), "tagName", null);
        setField(term104951, term104951.getClass(), "normalName", null);
        setField(term104951, term104951.getClass(), "pendingAttributeName", null);
        setField(term104952, term104952.getClass(), "value", term104953);
        setByteField(term104952, term104952.getClass(), "coder", (byte) 0);
        setIntField(term104952, term104952.getClass(), "count", 0);
        setField(term104951, term104951.getClass(), "pendingAttributeValue", term104952);
        setField(term104951, term104951.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term104951, term104951.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term104951, term104951.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term104951, term104951.getClass(), "selfClosing", false);
        setIntField(term104954, term104954.getClass(), "size", 0);
        setField(term104954, term104954.getClass(), "keys", term104955);
        setField(term104954, term104954.getClass(), "vals", term104956);
        setField(term104951, term104951.getClass(), "attributes", term104954);
        setField(term104951, term104951.getClass(), "type", enum301);
        setField(term104949, term104949.getClass(), "start", term104951);
        setField(term104960, term104960.getClass(), "tagName", null);
        setField(term104960, term104960.getClass(), "normalName", null);
        setField(term104960, term104960.getClass(), "pendingAttributeName", null);
        setField(term104961, term104961.getClass(), "value", term104962);
        setByteField(term104961, term104961.getClass(), "coder", (byte) 0);
        setIntField(term104961, term104961.getClass(), "count", 0);
        setField(term104960, term104960.getClass(), "pendingAttributeValue", term104961);
        setField(term104960, term104960.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term104960, term104960.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term104960, term104960.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term104960, term104960.getClass(), "selfClosing", false);
        setField(term104960, term104960.getClass(), "attributes", null);
        setField(term104960, term104960.getClass(), "type", enum302);
        setField(term104949, term104949.getClass(), "end", term104960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term104949));
    }

};


