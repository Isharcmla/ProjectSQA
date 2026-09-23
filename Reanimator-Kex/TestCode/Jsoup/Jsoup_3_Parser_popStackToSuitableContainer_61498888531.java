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
import java.util.HashSet;
import java.util.ArrayList;

public class Parser_popStackToSuitableContainer_61498888531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443;
     Object term1492;

    public Parser_popStackToSuitableContainer_61498888531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term1455 = new HashSet();
        ArrayList term1456 = new ArrayList();
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        ((ArrayList) term1456).add((Object)null);
        Object term1447 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1448 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1459 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1448, term1448.getClass(), "tagName", null);
        setBooleanField(term1448, term1448.getClass(), "isBlock", true);
        setBooleanField(term1448, term1448.getClass(), "canContainBlock", false);
        setBooleanField(term1448, term1448.getClass(), "canContainInline", true);
        setBooleanField(term1448, term1448.getClass(), "optionalClosing", true);
        setBooleanField(term1448, term1448.getClass(), "empty", false);
        setBooleanField(term1448, term1448.getClass(), "preserveWhitespace", true);
        setField(term1448, term1448.getClass(), "ancestors", null);
        setField(term1447, term1447.getClass(), "tag", term1448);
        setField(term1447, term1447.getClass(), "classNames", term1455);
        setField(term1447, term1447.getClass(), "parentNode", null);
        setField(term1447, term1447.getClass(), "childNodes", term1456);
        setField(term1459, term1459.getClass(), "attributes", null);
        setField(term1447, term1447.getClass(), "attributes", term1459);
        setField(term1447, term1447.getClass(), "baseUri", "");
        Object term1462 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1462, term1462.getClass(), "tag", null);
        setField(term1462, term1462.getClass(), "classNames", null);
        setField(term1462, term1462.getClass(), "parentNode", null);
        setField(term1462, term1462.getClass(), "childNodes", null);
        setField(term1462, term1462.getClass(), "attributes", null);
        setField(term1462, term1462.getClass(), "baseUri", null);
        LinkedList term1444 = new LinkedList();
        ((LinkedList) term1444).add(term1447);
        ((LinkedList) term1444).add(term1462);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        ((LinkedList) term1444).add((Object)null);
        term1443 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1478 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term1479 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term1443, term1443.getClass(), "stack", term1444);
        setField(term1478, term1478.getClass(), "queue", null);
        setField(term1443, term1443.getClass(), "tq", term1478);
        setField(term1479, term1479.getClass(), "tag", null);
        setField(term1479, term1479.getClass(), "classNames", null);
        setField(term1479, term1479.getClass(), "parentNode", null);
        setField(term1479, term1479.getClass(), "childNodes", null);
        setField(term1479, term1479.getClass(), "attributes", null);
        setField(term1479, term1479.getClass(), "baseUri", null);
        setField(term1443, term1443.getClass(), "doc", term1479);
        setField(term1443, term1443.getClass(), "baseUri", "PSizQDoxxe");
        ArrayList term1521 = new ArrayList();
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        ((ArrayList) term1521).add((Object)null);
        Object term1513 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1513, term1513.getClass(), "tagName", "");
        setBooleanField(term1513, term1513.getClass(), "isBlock", true);
        setBooleanField(term1513, term1513.getClass(), "canContainBlock", false);
        setBooleanField(term1513, term1513.getClass(), "canContainInline", false);
        setBooleanField(term1513, term1513.getClass(), "optionalClosing", true);
        setBooleanField(term1513, term1513.getClass(), "empty", false);
        setBooleanField(term1513, term1513.getClass(), "preserveWhitespace", true);
        setField(term1513, term1513.getClass(), "ancestors", term1521);
        ArrayList term1532 = new ArrayList();
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        ((ArrayList) term1532).add((Object)null);
        Object term1524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1524, term1524.getClass(), "tagName", "");
        setBooleanField(term1524, term1524.getClass(), "isBlock", true);
        setBooleanField(term1524, term1524.getClass(), "canContainBlock", true);
        setBooleanField(term1524, term1524.getClass(), "canContainInline", true);
        setBooleanField(term1524, term1524.getClass(), "optionalClosing", false);
        setBooleanField(term1524, term1524.getClass(), "empty", true);
        setBooleanField(term1524, term1524.getClass(), "preserveWhitespace", false);
        setField(term1524, term1524.getClass(), "ancestors", term1532);
        ArrayList term1543 = new ArrayList();
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        ((ArrayList) term1543).add((Object)null);
        Object term1535 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1535, term1535.getClass(), "tagName", "");
        setBooleanField(term1535, term1535.getClass(), "isBlock", true);
        setBooleanField(term1535, term1535.getClass(), "canContainBlock", true);
        setBooleanField(term1535, term1535.getClass(), "canContainInline", true);
        setBooleanField(term1535, term1535.getClass(), "optionalClosing", false);
        setBooleanField(term1535, term1535.getClass(), "empty", false);
        setBooleanField(term1535, term1535.getClass(), "preserveWhitespace", false);
        setField(term1535, term1535.getClass(), "ancestors", term1543);
        ArrayList term1554 = new ArrayList();
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        ((ArrayList) term1554).add((Object)null);
        Object term1546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1546, term1546.getClass(), "tagName", "");
        setBooleanField(term1546, term1546.getClass(), "isBlock", false);
        setBooleanField(term1546, term1546.getClass(), "canContainBlock", false);
        setBooleanField(term1546, term1546.getClass(), "canContainInline", true);
        setBooleanField(term1546, term1546.getClass(), "optionalClosing", true);
        setBooleanField(term1546, term1546.getClass(), "empty", false);
        setBooleanField(term1546, term1546.getClass(), "preserveWhitespace", false);
        setField(term1546, term1546.getClass(), "ancestors", term1554);
        ArrayList term1511 = new ArrayList();
        ((ArrayList) term1511).add(term1513);
        ((ArrayList) term1511).add(term1524);
        ((ArrayList) term1511).add(term1535);
        ((ArrayList) term1511).add(term1546);
        term1492 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1492, term1492.getClass(), "tagName", "mKaHyMybrK");
        setBooleanField(term1492, term1492.getClass(), "isBlock", false);
        setBooleanField(term1492, term1492.getClass(), "canContainBlock", false);
        setBooleanField(term1492, term1492.getClass(), "canContainInline", true);
        setBooleanField(term1492, term1492.getClass(), "optionalClosing", true);
        setBooleanField(term1492, term1492.getClass(), "empty", false);
        setBooleanField(term1492, term1492.getClass(), "preserveWhitespace", true);
        setField(term1492, term1492.getClass(), "ancestors", term1511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term1492;
        try {
            callMethod(klass, "popStackToSuitableContainer", argTypes, term1443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


