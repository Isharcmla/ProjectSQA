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
import java.util.ArrayList;
import java.lang.String;

public class Parser_htmlParser_111645799332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7806;

    public Parser_htmlParser_111645799332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7809 = new ArrayList();
        ArrayList term7813 = new ArrayList();
        Class<? extends Object> term7985 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term7984 = ((Class) term7985).getDeclaredField((String) "Character");
        ((Field) term7984).setAccessible(true);
        Object enum0 = ((Field) term7984).get((Object) null);
        Class<? extends Object> term8387 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term8386 = ((Class) term8387).getDeclaredField((String) "Doctype");
        ((Field) term8386).setAccessible(true);
        Object enum1 = ((Field) term8386).get((Object) null);
        term7806 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7807 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term7817 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7818 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7819 = (byte[]) newByteArray(16);
        Object[] term7847 = (Object[]) newArray("java.lang.String", 1);
        Object term7848 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7849 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7850 = (byte[]) newByteArray(16);
        Object term7872 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term7876 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7877 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7878 = (byte[]) newByteArray(16);
        Object term7901 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term7807, term7807.getClass(), "state", null);
        setField(term7807, term7807.getClass(), "originalState", null);
        setBooleanField(term7807, term7807.getClass(), "baseUriSetFromDoc", false);
        setField(term7807, term7807.getClass(), "headElement", null);
        setField(term7807, term7807.getClass(), "formElement", null);
        setField(term7807, term7807.getClass(), "contextElement", null);
        setField(term7807, term7807.getClass(), "formattingElements", term7809);
        setField(term7807, term7807.getClass(), "pendingTableCharacters", term7813);
        setField(term7817, term7817.getClass(), "tagName", null);
        setField(term7817, term7817.getClass(), "normalName", null);
        setField(term7817, term7817.getClass(), "pendingAttributeName", null);
        setField(term7818, term7818.getClass(), "value", term7819);
        setByteField(term7818, term7818.getClass(), "coder", (byte) 0);
        setIntField(term7818, term7818.getClass(), "count", 0);
        setField(term7817, term7817.getClass(), "pendingAttributeValue", term7818);
        setField(term7817, term7817.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7817, term7817.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7817, term7817.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7817, term7817.getClass(), "selfClosing", false);
        setField(term7817, term7817.getClass(), "attributes", null);
        setField(term7817, term7817.getClass(), "type", enum0);
        setField(term7807, term7807.getClass(), "emptyEnd", term7817);
        setBooleanField(term7807, term7807.getClass(), "framesetOk", true);
        setBooleanField(term7807, term7807.getClass(), "fosterInserts", false);
        setBooleanField(term7807, term7807.getClass(), "fragmentParsing", false);
        setField(term7807, term7807.getClass(), "specificScopeTarget", term7847);
        setField(term7807, term7807.getClass(), "reader", null);
        setField(term7807, term7807.getClass(), "tokeniser", null);
        setField(term7807, term7807.getClass(), "doc", null);
        setField(term7807, term7807.getClass(), "stack", null);
        setField(term7807, term7807.getClass(), "baseUri", null);
        setField(term7807, term7807.getClass(), "currentToken", null);
        setField(term7807, term7807.getClass(), "errors", null);
        setField(term7807, term7807.getClass(), "settings", null);
        setField(term7848, term7848.getClass(), "tagName", null);
        setField(term7848, term7848.getClass(), "normalName", null);
        setField(term7848, term7848.getClass(), "pendingAttributeName", null);
        setField(term7849, term7849.getClass(), "value", term7850);
        setByteField(term7849, term7849.getClass(), "coder", (byte) 0);
        setIntField(term7849, term7849.getClass(), "count", 0);
        setField(term7848, term7848.getClass(), "pendingAttributeValue", term7849);
        setField(term7848, term7848.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7848, term7848.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7848, term7848.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7848, term7848.getClass(), "selfClosing", false);
        setField(term7872, term7872.getClass(), "attributes", null);
        setField(term7848, term7848.getClass(), "attributes", term7872);
        setField(term7848, term7848.getClass(), "type", enum1);
        setField(term7807, term7807.getClass(), "start", term7848);
        setField(term7876, term7876.getClass(), "tagName", null);
        setField(term7876, term7876.getClass(), "normalName", null);
        setField(term7876, term7876.getClass(), "pendingAttributeName", null);
        setField(term7877, term7877.getClass(), "value", term7878);
        setByteField(term7877, term7877.getClass(), "coder", (byte) 0);
        setIntField(term7877, term7877.getClass(), "count", 0);
        setField(term7876, term7876.getClass(), "pendingAttributeValue", term7877);
        setField(term7876, term7876.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term7876, term7876.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7876, term7876.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7876, term7876.getClass(), "selfClosing", false);
        setField(term7876, term7876.getClass(), "attributes", null);
        setField(term7876, term7876.getClass(), "type", enum0);
        setField(term7807, term7807.getClass(), "end", term7876);
        setField(term7806, term7806.getClass(), "treeBuilder", term7807);
        setIntField(term7806, term7806.getClass(), "maxErrors", 0);
        setField(term7806, term7806.getClass(), "errors", null);
        setBooleanField(term7901, term7901.getClass(), "preserveTagCase", false);
        setBooleanField(term7901, term7901.getClass(), "preserveAttributeCase", false);
        setField(term7806, term7806.getClass(), "settings", term7901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "htmlParser", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term7806));
    }

};


