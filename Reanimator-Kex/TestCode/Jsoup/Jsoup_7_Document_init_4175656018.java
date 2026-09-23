package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_init_4175656018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13023;

    public Document_init_4175656018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13066 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term13065 = ((Class) term13066).getDeclaredField((String) "base");
        ((Field) term13065).setAccessible(true);
        Object enum12 = ((Field) term13065).get((Object) null);
        Object term13045 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13045, term13045.getClass(), "tagName", null);
        setBooleanField(term13045, term13045.getClass(), "knownTag", true);
        setBooleanField(term13045, term13045.getClass(), "isBlock", true);
        setBooleanField(term13045, term13045.getClass(), "canContainBlock", true);
        setBooleanField(term13045, term13045.getClass(), "canContainInline", true);
        setBooleanField(term13045, term13045.getClass(), "optionalClosing", false);
        setBooleanField(term13045, term13045.getClass(), "empty", false);
        setBooleanField(term13045, term13045.getClass(), "selfClosing", false);
        setBooleanField(term13045, term13045.getClass(), "preserveWhitespace", false);
        setField(term13045, term13045.getClass(), "ancestors", null);
        setField(term13045, term13045.getClass(), "excludes", null);
        setField(term13045, term13045.getClass(), "ignoreEndTags", null);
        setBooleanField(term13045, term13045.getClass(), "directDescendant", false);
        setBooleanField(term13045, term13045.getClass(), "limitChildren", false);
        ArrayList term13043 = new ArrayList();
        ((ArrayList) term13043).add(term13045);
        ArrayList term13047 = new ArrayList();
        LinkedHashMap term13050 = new LinkedHashMap();
        term13023 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term13024 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term13030 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term13033 = (Object[]) newArray("java.lang.String", 2);
        Object term13036 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term13037 = (byte[]) newByteArray(1);
        Object term13038 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        Object term13040 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term13046 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term13049 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13024, term13024.getClass(), "escapeMode", enum12);
        setField(term13030, term13030.getClass(), "name", "UTF-8");
        setElement(term13033, 0, "");
        setElement(term13033, 1, "");
        setField(term13030, term13030.getClass(), "aliases", term13033);
        setField(term13030, term13030.getClass(), "aliasSet", null);
        setField(term13024, term13024.getClass(), "charset", term13030);
        setField(term13036, term13036.getClass(), "sgp", null);
        setField(term13036, term13036.getClass(), "charset", term13030);
        setFloatField(term13036, term13036.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term13036, term13036.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term13037, 0, (byte) 63);
        setField(term13036, term13036.getClass(), "replacement", term13037);
        setField(term13038, term13038.getClass(), "name", "");
        setField(term13036, term13036.getClass(), "malformedInputAction", term13038);
        setField(term13036, term13036.getClass(), "unmappableCharacterAction", term13038);
        setIntField(term13036, term13036.getClass(), "state", 0);
        setField(term13036, term13036.getClass(), "cachedDecoder", null);
        setField(term13024, term13024.getClass(), "charsetEncoder", term13036);
        setBooleanField(term13024, term13024.getClass(), "prettyPrint", true);
        setIntField(term13024, term13024.getClass(), "indentAmount", 1);
        setField(term13024, term13024.getClass(), "this$0", term13023);
        setField(term13023, term13023.getClass(), "outputSettings", term13024);
        setField(term13040, term13040.getClass(), "tagName", "#root");
        setBooleanField(term13040, term13040.getClass(), "knownTag", false);
        setBooleanField(term13040, term13040.getClass(), "isBlock", false);
        setBooleanField(term13040, term13040.getClass(), "canContainBlock", true);
        setBooleanField(term13040, term13040.getClass(), "canContainInline", true);
        setBooleanField(term13040, term13040.getClass(), "optionalClosing", false);
        setBooleanField(term13040, term13040.getClass(), "empty", false);
        setBooleanField(term13040, term13040.getClass(), "selfClosing", false);
        setBooleanField(term13040, term13040.getClass(), "preserveWhitespace", false);
        setField(term13040, term13040.getClass(), "ancestors", term13043);
        setIntField(term13046, term13046.getClass(), "modCount", 0);
        setField(term13040, term13040.getClass(), "excludes", term13046);
        setField(term13040, term13040.getClass(), "ignoreEndTags", term13046);
        setBooleanField(term13040, term13040.getClass(), "directDescendant", false);
        setBooleanField(term13040, term13040.getClass(), "limitChildren", false);
        setField(term13023, term13023.getClass(), "tag", term13040);
        setField(term13023, term13023.getClass(), "classNames", null);
        setField(term13023, term13023.getClass(), "parentNode", null);
        setField(term13023, term13023.getClass(), "childNodes", term13047);
        setField(term13049, term13049.getClass(), "attributes", term13050);
        setField(term13023, term13023.getClass(), "attributes", term13049);
        setField(term13023, term13023.getClass(), "baseUri", "PAEBtnZtTD");
        setIntField(term13023, term13023.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13023));
    }

};


