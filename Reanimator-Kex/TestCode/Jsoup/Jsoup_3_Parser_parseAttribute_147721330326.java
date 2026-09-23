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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Parser_parseAttribute_147721330326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664;

    public Parser_parseAttribute_147721330326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term665 = new LinkedList();
        Character term672 = new Character('M');
        Character term675 = new Character('u');
        LinkedList term669 = new LinkedList();
        ((LinkedList) term669).add(term672);
        ((LinkedList) term669).add(term675);
        ((LinkedList) term669).add((Object)null);
        ((LinkedList) term669).add((Object)null);
        ((LinkedList) term669).add((Object)null);
        ArrayList term704 = new ArrayList();
        ((ArrayList) term704).add((Object)null);
        ((ArrayList) term704).add((Object)null);
        ((ArrayList) term704).add((Object)null);
        ((ArrayList) term704).add((Object)null);
        HashMap term709 = new HashMap();
        Set<Object> term24180 =  ((Map) term709).keySet();
        HashSet term708 = new HashSet((Collection<? extends Object>) term24180);
        ArrayList term715 = new ArrayList();
        ((ArrayList) term715).add((Object)null);
        ((ArrayList) term715).add((Object)null);
        ((ArrayList) term715).add((Object)null);
        LinkedHashMap term720 = new LinkedHashMap();
        term664 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term668 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term684 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term719 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term664, term664.getClass(), "stack", term665);
        setField(term668, term668.getClass(), "queue", term669);
        setField(term664, term664.getClass(), "tq", term668);
        setField(term685, term685.getClass(), "tagName", "TwfWVQGiIj");
        setBooleanField(term685, term685.getClass(), "isBlock", false);
        setBooleanField(term685, term685.getClass(), "canContainBlock", true);
        setBooleanField(term685, term685.getClass(), "canContainInline", true);
        setBooleanField(term685, term685.getClass(), "optionalClosing", true);
        setBooleanField(term685, term685.getClass(), "empty", false);
        setBooleanField(term685, term685.getClass(), "preserveWhitespace", true);
        setField(term685, term685.getClass(), "ancestors", term704);
        setField(term684, term684.getClass(), "tag", term685);
        setField(term684, term684.getClass(), "classNames", term708);
        setField(term684, term684.getClass(), "parentNode", null);
        setField(term684, term684.getClass(), "childNodes", term715);
        setField(term719, term719.getClass(), "attributes", term720);
        setField(term684, term684.getClass(), "attributes", term719);
        setField(term684, term684.getClass(), "baseUri", "PqtVXXZMqK");
        setField(term664, term664.getClass(), "doc", term684);
        setField(term664, term664.getClass(), "baseUri", "rYbtIDVdnd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseAttribute", argTypes, term664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


