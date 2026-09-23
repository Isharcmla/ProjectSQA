package org.apache.commons.compress.archivers.dump;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.LinkedList;

public class DumpArchiveInputStream_readDirectoryEntry_48254916632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13004;
     Object term13777;

    public DumpArchiveInputStream_readDirectoryEntry_48254916632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31316 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TYPE");
        Field term31315 = ((Class) term31316).getDeclaredField((String) "UNKNOWN");
        ((Field) term31315).setAccessible(true);
        Object enum11 = ((Field) term31315).get((Object) null);
        HashMap term13725 = new HashMap();
        HashMap term13739 = new HashMap();
        LinkedList term13763 = new LinkedList();
        term13004 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term13005 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveSummary"));
        Object term13061 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term13087 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term13093 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveSummary"));
        Object term13149 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term13154 = (byte[]) newByteArray(512);
        byte[] term13703 = (byte[]) newByteArray(5);
        byte[] term13709 = (byte[]) newByteArray(5);
        Object term13717 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        byte[] term13718 = (byte[]) newByteArray(1);
        byte[] term13766 = (byte[]) newByteArray(9);
        setLongField(term13005, term13005.getClass(), "dumpDate", 4811527754205378980L);
        setLongField(term13005, term13005.getClass(), "previousDumpDate", 9174730812791817537L);
        setIntField(term13005, term13005.getClass(), "volume", 1053773809);
        setField(term13005, term13005.getClass(), "label", "NFlvfJCVPO");
        setIntField(term13005, term13005.getClass(), "level", 924127883);
        setField(term13005, term13005.getClass(), "filesys", "KarbTXFmUU");
        setField(term13005, term13005.getClass(), "devname", "jiUSjqwSIQ");
        setField(term13005, term13005.getClass(), "hostname", "MgLCedQfoj");
        setIntField(term13005, term13005.getClass(), "flags", -751079123);
        setIntField(term13005, term13005.getClass(), "firstrec", -110837188);
        setIntField(term13005, term13005.getClass(), "ntrec", -271094506);
        setField(term13004, term13004.getClass(), "summary", term13005);
        setField(term13061, term13061.getClass(), "name", "zgKiINdgNu");
        setField(term13061, term13061.getClass(), "type", enum11);
        setIntField(term13061, term13061.getClass(), "mode", 455632030);
        setField(term13061, term13061.getClass(), "permissions", term13087);
        setLongField(term13061, term13061.getClass(), "size", 8024477479047145752L);
        setLongField(term13061, term13061.getClass(), "atime", 7006402814669334483L);
        setLongField(term13061, term13061.getClass(), "mtime", -4003544865306793676L);
        setIntField(term13061, term13061.getClass(), "uid", -1632929393);
        setIntField(term13061, term13061.getClass(), "gid", -431440129);
        setLongField(term13093, term13093.getClass(), "dumpDate", -769824408235898287L);
        setLongField(term13093, term13093.getClass(), "previousDumpDate", -2828343143039517941L);
        setIntField(term13093, term13093.getClass(), "volume", -763576148);
        setField(term13093, term13093.getClass(), "label", "zLMTXDQHYH");
        setIntField(term13093, term13093.getClass(), "level", 1568948514);
        setField(term13093, term13093.getClass(), "filesys", "PqywFWJlpE");
        setField(term13093, term13093.getClass(), "devname", "OzXRsFGTIp");
        setField(term13093, term13093.getClass(), "hostname", "TjWpyghUWN");
        setIntField(term13093, term13093.getClass(), "flags", -1511130237);
        setIntField(term13093, term13093.getClass(), "firstrec", 452088587);
        setIntField(term13093, term13093.getClass(), "ntrec", -1630069454);
        setField(term13061, term13061.getClass(), "summary", term13093);
        setField(term13149, term13149.getClass(), "type", null);
        setIntField(term13149, term13149.getClass(), "volume", 0);
        setIntField(term13149, term13149.getClass(), "ino", 0);
        setIntField(term13149, term13149.getClass(), "count", 0);
        setIntField(term13149, term13149.getClass(), "holes", 0);
        setField(term13149, term13149.getClass(), "cdata", term13154);
        setField(term13061, term13061.getClass(), "header", term13149);
        setField(term13061, term13061.getClass(), "simpleName", "dkZFDZxcde");
        setField(term13061, term13061.getClass(), "originalName", "WXcZEtUKlI");
        setIntField(term13061, term13061.getClass(), "volume", 1499735894);
        setLongField(term13061, term13061.getClass(), "offset", 2809748481176687920L);
        setIntField(term13061, term13061.getClass(), "ino", 716486048);
        setIntField(term13061, term13061.getClass(), "nlink", -466708718);
        setLongField(term13061, term13061.getClass(), "ctime", 4012955251407483889L);
        setIntField(term13061, term13061.getClass(), "generation", 1038029515);
        setBooleanField(term13061, term13061.getClass(), "isDeleted", false);
        setField(term13004, term13004.getClass(), "active", term13061);
        setBooleanField(term13004, term13004.getClass(), "isClosed", false);
        setBooleanField(term13004, term13004.getClass(), "hasHitEOF", false);
        setLongField(term13004, term13004.getClass(), "entrySize", -4058686252500969842L);
        setLongField(term13004, term13004.getClass(), "entryOffset", 6077991958696417121L);
        setIntField(term13004, term13004.getClass(), "readIdx", 1137154606);
        setByteElement(term13703, 0, (byte) -101);
        setByteElement(term13703, 1, (byte) -102);
        setByteElement(term13703, 2, (byte) -95);
        setByteElement(term13703, 3, (byte) -2);
        setByteElement(term13703, 4, (byte) 28);
        setField(term13004, term13004.getClass(), "readBuf", term13703);
        setByteElement(term13709, 0, (byte) 84);
        setByteElement(term13709, 1, (byte) 85);
        setByteElement(term13709, 2, (byte) -17);
        setByteElement(term13709, 3, (byte) -83);
        setByteElement(term13709, 4, (byte) 48);
        setField(term13004, term13004.getClass(), "blockBuffer", term13709);
        setIntField(term13004, term13004.getClass(), "recordOffset", -100681578);
        setLongField(term13004, term13004.getClass(), "filepos", -5004803270846838598L);
        setByteElement(term13718, 0, (byte) -128);
        setField(term13717, term13717.getClass(), "blockBuffer", term13718);
        setIntField(term13717, term13717.getClass(), "currBlkIdx", 296568835);
        setIntField(term13717, term13717.getClass(), "blockSize", 1431951992);
        setIntField(term13717, term13717.getClass(), "readOffset", -1608123016);
        setBooleanField(term13717, term13717.getClass(), "isCompressed", false);
        setLongField(term13717, term13717.getClass(), "bytesRead", -8211859616692114655L);
        setField(term13717, term13717.getClass(), "in", null);
        setField(term13004, term13004.getClass(), "raw", term13717);
        setField(term13004, term13004.getClass(), "names", term13725);
        setField(term13004, term13004.getClass(), "pending", term13739);
        setField(term13004, term13004.getClass(), "queue", term13763);
        setField(term13004, term13004.getClass(), "zipEncoding", null);
        setByteElement(term13766, 0, (byte) 70);
        setByteElement(term13766, 1, (byte) -28);
        setByteElement(term13766, 2, (byte) 115);
        setByteElement(term13766, 3, (byte) 96);
        setByteElement(term13766, 4, (byte) 51);
        setByteElement(term13766, 5, (byte) -53);
        setByteElement(term13766, 6, (byte) -8);
        setByteElement(term13766, 7, (byte) -9);
        setByteElement(term13766, 8, (byte) 97);
        setField(term13004, term13004.getClass(), "SINGLE", term13766);
        setLongField(term13004, term13004.getClass(), "bytesRead", 3103198349031409063L);
        term13777 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term13796 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveSummary"));
        Object term13852 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term13857 = (byte[]) newByteArray(512);
        setField(term13777, term13777.getClass(), "name", "QtrylgCLiF");
        setField(term13777, term13777.getClass(), "type", enum11);
        setIntField(term13777, term13777.getClass(), "mode", 1789351397);
        setField(term13777, term13777.getClass(), "permissions", term13087);
        setLongField(term13777, term13777.getClass(), "size", 753095050088595263L);
        setLongField(term13777, term13777.getClass(), "atime", 3643973882575578879L);
        setLongField(term13777, term13777.getClass(), "mtime", -1750555031444556464L);
        setIntField(term13777, term13777.getClass(), "uid", 2145528170);
        setIntField(term13777, term13777.getClass(), "gid", -585773976);
        setLongField(term13796, term13796.getClass(), "dumpDate", -3231440836116263235L);
        setLongField(term13796, term13796.getClass(), "previousDumpDate", 8010417010297313651L);
        setIntField(term13796, term13796.getClass(), "volume", 852806940);
        setField(term13796, term13796.getClass(), "label", "orEuhCStGM");
        setIntField(term13796, term13796.getClass(), "level", 698551724);
        setField(term13796, term13796.getClass(), "filesys", "HhEaSXWvrY");
        setField(term13796, term13796.getClass(), "devname", "CVRGEomOth");
        setField(term13796, term13796.getClass(), "hostname", "vSeruUyNWX");
        setIntField(term13796, term13796.getClass(), "flags", -1631048635);
        setIntField(term13796, term13796.getClass(), "firstrec", 1342808731);
        setIntField(term13796, term13796.getClass(), "ntrec", -64893740);
        setField(term13777, term13777.getClass(), "summary", term13796);
        setField(term13852, term13852.getClass(), "type", null);
        setIntField(term13852, term13852.getClass(), "volume", 0);
        setIntField(term13852, term13852.getClass(), "ino", 0);
        setIntField(term13852, term13852.getClass(), "count", 0);
        setIntField(term13852, term13852.getClass(), "holes", 0);
        setField(term13852, term13852.getClass(), "cdata", term13857);
        setField(term13777, term13777.getClass(), "header", term13852);
        setField(term13777, term13777.getClass(), "simpleName", "UkKvaeJfEC");
        setField(term13777, term13777.getClass(), "originalName", "WPxXsahPRq");
        setIntField(term13777, term13777.getClass(), "volume", -222012928);
        setLongField(term13777, term13777.getClass(), "offset", 5845993504299821981L);
        setIntField(term13777, term13777.getClass(), "ino", -146564963);
        setIntField(term13777, term13777.getClass(), "nlink", -83178716);
        setLongField(term13777, term13777.getClass(), "ctime", -1528017371096319990L);
        setIntField(term13777, term13777.getClass(), "generation", -1292704466);
        setBooleanField(term13777, term13777.getClass(), "isDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term13777;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term13004, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


