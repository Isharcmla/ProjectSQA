package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class ZipArchiveEntry_setVersionRequired_190693513353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34630;
     Object term34812;

    public ZipArchiveEntry_setVersionRequired_190693513353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34832 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term34831 = ((Class) term34832).getDeclaredField((String) "HOURS");
        ((Field) term34831).setAccessible(true);
        Object enum131 = ((Field) term34831).get((Object) null);
        Class<? extends Object> term35009 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term35008 = ((Class) term35009).getDeclaredField((String) "NANOSECONDS");
        ((Field) term35008).setAccessible(true);
        Object enum132 = ((Field) term35008).get((Object) null);
        Class<? extends Object> term35204 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term35203 = ((Class) term35204).getDeclaredField((String) "MICROSECONDS");
        ((Field) term35203).setAccessible(true);
        Object enum133 = ((Field) term35203).get((Object) null);
        term34630 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object[] term34639 = (Object[]) newArray("org.apache.commons.compress.archivers.zip.ZipExtraField", 2);
        Object term34640 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term34641 = (byte[]) newByteArray(3);
        byte[] term34645 = (byte[]) newByteArray(9);
        byte[] term34657 = (byte[]) newByteArray(5);
        Object term34663 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term34673 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34692 = newInstance(Class.forName("java.time.Instant"));
        Object term34707 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34732 = newInstance(Class.forName("java.time.Instant"));
        Object term34747 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34773 = newInstance(Class.forName("java.time.Instant"));
        byte[] term34793 = (byte[]) newByteArray(5);
        setIntField(term34630, term34630.getClass(), "method", -1);
        setLongField(term34630, term34630.getClass(), "size", -1L);
        setIntField(term34630, term34630.getClass(), "internalAttributes", 787278105);
        setIntField(term34630, term34630.getClass(), "versionRequired", -2063843486);
        setIntField(term34630, term34630.getClass(), "versionMadeBy", 833762980);
        setIntField(term34630, term34630.getClass(), "platform", 320711637);
        setIntField(term34630, term34630.getClass(), "rawFlag", 1241164745);
        setLongField(term34630, term34630.getClass(), "externalAttributes", -1885698929232124806L);
        setField(term34630, term34630.getClass(), "extraFields", term34639);
        setByteElement(term34641, 0, (byte) -104);
        setByteElement(term34641, 1, (byte) -20);
        setByteElement(term34641, 2, (byte) 24);
        setField(term34640, term34640.getClass(), "localFileData", term34641);
        setByteElement(term34645, 0, (byte) -53);
        setByteElement(term34645, 1, (byte) 27);
        setByteElement(term34645, 2, (byte) 74);
        setByteElement(term34645, 3, (byte) -112);
        setByteElement(term34645, 4, (byte) 3);
        setByteElement(term34645, 5, (byte) 79);
        setByteElement(term34645, 6, (byte) -42);
        setByteElement(term34645, 7, (byte) 92);
        setByteElement(term34645, 8, (byte) 10);
        setField(term34640, term34640.getClass(), "centralDirectoryData", term34645);
        setField(term34630, term34630.getClass(), "unparseableExtra", term34640);
        setField(term34630, term34630.getClass(), "name", "");
        setByteElement(term34657, 0, (byte) -111);
        setByteElement(term34657, 1, (byte) -13);
        setByteElement(term34657, 2, (byte) -4);
        setByteElement(term34657, 3, (byte) 43);
        setByteElement(term34657, 4, (byte) 60);
        setField(term34630, term34630.getClass(), "rawName", term34657);
        setBooleanField(term34663, term34663.getClass(), "languageEncodingFlag", false);
        setBooleanField(term34663, term34663.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term34663, term34663.getClass(), "encryptionFlag", false);
        setBooleanField(term34663, term34663.getClass(), "strongEncryptionFlag", false);
        setIntField(term34663, term34663.getClass(), "slidingDictionarySize", 0);
        setIntField(term34663, term34663.getClass(), "numberOfShannonFanoTrees", 0);
        setField(term34630, term34630.getClass(), "gpb", term34663);
        setLongField(term34630, term34630.getClass(), "xdostime", -1L);
        setField(term34673, term34673.getClass(), "unit", enum131);
        setLongField(term34673, term34673.getClass(), "value", 5731563613239387113L);
        setLongField(term34692, term34692.getClass(), "seconds", 1847852235L);
        setIntField(term34692, term34692.getClass(), "nanos", 18000000);
        setField(term34673, term34673.getClass(), "instant", term34692);
        setField(term34673, term34673.getClass(), "valueAsString", "tlzpzIjMib");
        setField(term34630, term34630.getClass(), "mtime", term34673);
        setField(term34707, term34707.getClass(), "unit", enum132);
        setLongField(term34707, term34707.getClass(), "value", 3381333711768010594L);
        setLongField(term34732, term34732.getClass(), "seconds", 1744288719L);
        setIntField(term34732, term34732.getClass(), "nanos", 416000000);
        setField(term34707, term34707.getClass(), "instant", term34732);
        setField(term34707, term34707.getClass(), "valueAsString", "AZdLeSugwv");
        setField(term34630, term34630.getClass(), "atime", term34707);
        setField(term34747, term34747.getClass(), "unit", enum133);
        setLongField(term34747, term34747.getClass(), "value", 3580984732036213717L);
        setLongField(term34773, term34773.getClass(), "seconds", 1312204139L);
        setIntField(term34773, term34773.getClass(), "nanos", 711000000);
        setField(term34747, term34747.getClass(), "instant", term34773);
        setField(term34747, term34747.getClass(), "valueAsString", "RMsXuyzKJV");
        setField(term34630, term34630.getClass(), "ctime", term34747);
        setLongField(term34630, term34630.getClass(), "crc", -1L);
        setLongField(term34630, term34630.getClass(), "csize", -1L);
        setIntField(term34630, term34630.getClass(), "flag", 1723148410);
        setByteElement(term34793, 0, (byte) -101);
        setByteElement(term34793, 1, (byte) -116);
        setByteElement(term34793, 2, (byte) -32);
        setByteElement(term34793, 3, (byte) 113);
        setByteElement(term34793, 4, (byte) -37);
        setField(term34630, term34630.getClass(), "extra", term34793);
        setField(term34630, term34630.getClass(), "comment", "FwPbDZcHmB");
        term34812 = new Integer(-1631697577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term34812;
        callMethod(klass, "setVersionRequired", argTypes, term34630, args);
    }

};


